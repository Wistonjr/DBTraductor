package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.SuscripcionDto;
import com.example.dbtraductor.entities.Suscripcion;
import com.example.dbtraductor.servicesinterfaces.ISuscripcionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService aS;

    @GetMapping
    public List<SuscripcionDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SuscripcionDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SuscripcionDto dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion a = m.map(dto, Suscripcion.class);
        aS.insert(a);
    }
    @GetMapping("/{id}")
    public SuscripcionDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        SuscripcionDto dto = m.map(aS.searchId(id), SuscripcionDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SuscripcionDto dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion a = m.map(dto, Suscripcion.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}
}
