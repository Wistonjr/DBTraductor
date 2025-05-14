package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.*;
import com.example.dbtraductor.entities.Glosario;
import com.example.dbtraductor.servicesinterfaces.IGlosarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/glosarios")
public class GlosarioController {
    @Autowired
    private IGlosarioService aS;

    @GetMapping
    public List<GlosarioDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GlosarioDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody GlosarioDto dto) {
        ModelMapper m = new ModelMapper();
        Glosario a = m.map(dto, Glosario.class);
        aS.insert(a);
    }

    @GetMapping("/{id}")
    public GlosarioDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        GlosarioDto dto = m.map(aS.searchId(id), GlosarioDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody GlosarioDto dto) {
        ModelMapper m = new ModelMapper();
        Glosario a = m.map(dto, Glosario.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}

    @GetMapping("/palabrasMasFrecuentes")
    public List<MostrarFrecuenciaPalabrasDto> listarFrecuenciaPalabras() {
        List<String[]> filaLista=aS.frecuenciaPalabrasGlosario();
        List<MostrarFrecuenciaPalabrasDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            MostrarFrecuenciaPalabrasDto dto=new MostrarFrecuenciaPalabrasDto();
            dto.setDescripcion(columna[0]);
            dto.setCantidadPalabras(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/cantidadTraduccionYPalabrasXDescripcion")
    public List<CantidadTraduccionYPalabrasDto> listarCantidadTraduccionYPalabrasXDescripcion() {
        List<String[]> filaLista=aS.conteoTraduccionYPalabrasPorDescripcion();
        List<CantidadTraduccionYPalabrasDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            CantidadTraduccionYPalabrasDto dto=new CantidadTraduccionYPalabrasDto();
            dto.setDescripcion(columna[0]);
            dto.setCantidadTraducciones(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
