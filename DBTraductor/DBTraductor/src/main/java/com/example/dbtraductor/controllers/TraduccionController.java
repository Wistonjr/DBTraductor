package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.TraduccionDto;
import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.servicesinterfaces.ITraduccionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/traducciones")
public class TraduccionController {
    @Autowired
    private ITraduccionService aS;

    @GetMapping
    public List<TraduccionDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TraduccionDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody TraduccionDto dto) {
        ModelMapper m = new ModelMapper();
        Traduccion a = m.map(dto, Traduccion.class);
        aS.insert(a);
    }
    @GetMapping("/{id}")
    public TraduccionDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        TraduccionDto dto = m.map(aS.searchId(id), TraduccionDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TraduccionDto dto) {
        ModelMapper m = new ModelMapper();
        Traduccion a = m.map(dto, Traduccion.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}
}
