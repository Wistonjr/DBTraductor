package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.BuscarTraduccionesUltimoMesDto;
import com.example.dbtraductor.dtos.CantidadTraduccionesComparXMetodoEnvioDto;
import com.example.dbtraductor.dtos.CompartirDto;
import com.example.dbtraductor.entities.Compartir;
import com.example.dbtraductor.servicesinterfaces.ICompartirService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/compartidos")
public class CompartirController {
    @Autowired
    private ICompartirService cS;
    @GetMapping
    public List<CompartirDto> listar() {
        return cS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CompartirDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody CompartirDto dto) {
        ModelMapper m = new ModelMapper();
        Compartir c = m.map(dto, Compartir.class);
        cS.insert(c);
    }

    @GetMapping("/{id}")
    public CompartirDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        CompartirDto dto=m.map(id, CompartirDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CompartirDto dto) {
        ModelMapper m = new ModelMapper();
        Compartir c = m.map(dto, Compartir.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {cS.delete(id);}

    @GetMapping("/cantidadTraduccionesCompartidasXMetodoEnvio")
    public List<CantidadTraduccionesComparXMetodoEnvioDto> listarCantidadTraduccionesCompartidasXMetodoEnvio() {
        List<String[]> filaLista=cS.cantidadTraduccionesCompartidasXMetodoEnvio();
        List<CantidadTraduccionesComparXMetodoEnvioDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            CantidadTraduccionesComparXMetodoEnvioDto dto=new CantidadTraduccionesComparXMetodoEnvioDto();
            dto.setMetodoEnvio(columna[0]);
            dto.setCantidadTraducciones(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/listarTraduccionesCompartidosUltimoMes")
    public List<BuscarTraduccionesUltimoMesDto> listarTraduccionesCompartidosUltimoMes() {
        List<String[]> filaLista=cS.buscarTraduccionesCompartidosUltimomes(LocalDate.now());
        List<BuscarTraduccionesUltimoMesDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            BuscarTraduccionesUltimoMesDto dto=new BuscarTraduccionesUltimoMesDto();
            dto.setIdTraduccion(Integer.parseInt(columna[0]));
            dto.setMetodoEnvio(columna[1]);
            dto.setFechaEnvio(LocalDate.parse(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
