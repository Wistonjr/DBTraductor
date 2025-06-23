package com.example.dbtraductor.controllers;


import com.example.dbtraductor.dtos.EscaneoDto;
import com.example.dbtraductor.dtos.TraduccionDto;
import com.example.dbtraductor.dtos.UsersDto;
import com.example.dbtraductor.entities.Escaneo;
import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.entities.Users;
import com.example.dbtraductor.servicesinterfaces.ITraduccionService;
import com.example.dbtraductor.servicesinterfaces.IUsersService;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsersController {
    @Autowired
    private IUsersService iS;

    @GetMapping
    public List<UsersDto> listar() {
        return iS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsersDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsersDto dto) {
        ModelMapper m = new ModelMapper();
        Users b = m.map(dto, Users.class);
        iS.insert(b);
    }

    @GetMapping("/{id}")
    public UsersDto buscarId(@PathVariable("id") long id) {
        ModelMapper m = new ModelMapper();
        UsersDto dto = m.map(iS.searchId(id), UsersDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UsersDto dto) {
        ModelMapper m = new ModelMapper();
        Users a = m.map(dto, Users.class);
        iS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") long id) {iS.delete(id);}
}
