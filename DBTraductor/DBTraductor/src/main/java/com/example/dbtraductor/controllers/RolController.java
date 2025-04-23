package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.RolDto;
import com.example.dbtraductor.entities.Rol;
import com.example.dbtraductor.servicesinterfaces.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private IRolService rS;

    @GetMapping
    public List<RolDto> listar(){
        return rS.list().stream().map(p->{
            ModelMapper m = new ModelMapper();
            return m.map(p, RolDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RolDto dto){
        ModelMapper m = new ModelMapper();
        Rol l= m.map(dto, Rol.class);
        rS.insert(l);
    }

}
