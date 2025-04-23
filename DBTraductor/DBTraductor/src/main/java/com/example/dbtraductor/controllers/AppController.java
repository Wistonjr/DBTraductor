package com.example.dbtraductor.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.dbtraductor.dtos.AppDto;
import com.example.dbtraductor.entities.App;
import com.example.dbtraductor.servicesinterfaces.IAppService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class AppController {
    //comentario prueba
    @Autowired
    private IAppService aS;

    @GetMapping
    public List<AppDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody AppDto dto) {
        ModelMapper m = new ModelMapper();
        App a = m.map(dto, App.class);
        aS.insert(a);
    }

    /*search id */
    @GetMapping("/{id}")
    public AppDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        AppDto dto = m.map(aS.searchId(id), AppDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody AppDto dto) {
        ModelMapper m = new ModelMapper();
        App a = m.map(dto, App.class);
        aS.update(a);
    }

@DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}

}
