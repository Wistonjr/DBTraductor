package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.SuscripcionDTO;
import com.example.dbtraductor.entities.Suscripcion;
import com.example.dbtraductor.servicesinterfaces.ISuscripcionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripcion")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService aS;

    @GetMapping
    public List<SuscripcionDTO> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SuscripcionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion a = m.map(dto, Suscripcion.class);
        aS.insert(a);
    }
    @GetMapping("/{id}")
    public SuscripcionDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        SuscripcionDTO dto = m.map(aS.searchId(id), SuscripcionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion a = m.map(dto, Suscripcion.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}
}
