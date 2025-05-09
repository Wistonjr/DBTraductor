package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.GlosarioDto;
import com.example.dbtraductor.entities.Glosario;
import com.example.dbtraductor.servicesinterfaces.IGlosarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
