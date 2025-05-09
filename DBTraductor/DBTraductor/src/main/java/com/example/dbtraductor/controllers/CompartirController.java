package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.CompartirDto;
import com.example.dbtraductor.entities.Compartir;
import com.example.dbtraductor.servicesinterfaces.ICompartirService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        CompartirDto dto = m.map(cS.searchId(id), CompartirDto.class);
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
}
