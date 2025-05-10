package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.BuscarLenguajeFrecuenteDto;
import com.example.dbtraductor.dtos.CantidadTraduccionesComparXMetodoEnvioDto;
import com.example.dbtraductor.dtos.ConteoMasDiezLenguajesDto;
import com.example.dbtraductor.dtos.LenguajeProgramacionDto;
import com.example.dbtraductor.entities.LenguajeProgramacion;
import com.example.dbtraductor.servicesinterfaces.ILenguajeProgramacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lenguajesprogramacion")
public class LenguajeProgramacionController {
    @Autowired
    private ILenguajeProgramacionService lP;
    @GetMapping
    public List<LenguajeProgramacionDto> listar() {
        return lP.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LenguajeProgramacionDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody LenguajeProgramacionDto dto) {
        ModelMapper m = new ModelMapper();
        LenguajeProgramacion c = m.map(dto, LenguajeProgramacion.class);
        lP.insert(c);
    }

    @GetMapping("/{id}")
    public LenguajeProgramacionDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        LenguajeProgramacionDto dto = m.map(lP.searchId(id), LenguajeProgramacionDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody LenguajeProgramacionDto dto) {
        ModelMapper m = new ModelMapper();
        LenguajeProgramacion c = m.map(dto, LenguajeProgramacion.class);
        lP.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {lP.delete(id);}

    @GetMapping("/buscarLenguajeFrecuente")
    public List<BuscarLenguajeFrecuenteDto> listarLenguajeFrecuente() {
        List<String[]> filaLista=lP.buscarLenguajeFrecuente();
        List<BuscarLenguajeFrecuenteDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            BuscarLenguajeFrecuenteDto dto=new BuscarLenguajeFrecuenteDto();
            dto.setNombre(columna[0]);
            dto.setTotalTraducciones(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/buscarCantidadMasDiezLenguajes")
    public List<ConteoMasDiezLenguajesDto> listarCantidadMasDiezLenguajes() {
        List<String[]> filaLista=lP.conteoConMasDiezLenguajes();
        List<ConteoMasDiezLenguajesDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            ConteoMasDiezLenguajesDto dto=new ConteoMasDiezLenguajesDto();
            dto.setTipo(columna[0]);
            dto.setCantidadLenguajes(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }




}
