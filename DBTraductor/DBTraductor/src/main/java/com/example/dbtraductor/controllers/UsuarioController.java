package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.UsuarioDto;
import com.example.dbtraductor.entities.Usuario;
import com.example.dbtraductor.servicesinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDto> listar() {
        return uS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsuarioDto dto) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(dto, Usuario.class);
        uS.insert(a);
    }

    /*search id */
    @GetMapping("/{id}")
    public UsuarioDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UsuarioDto dto = m.map(uS.searchId(id), UsuarioDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDto dto) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(dto, Usuario.class);
        uS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {uS.delete(id);}
}
