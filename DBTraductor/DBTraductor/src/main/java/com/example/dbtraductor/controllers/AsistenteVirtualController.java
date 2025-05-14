package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.AsistenteVirtualDto;
import com.example.dbtraductor.entities.AsistenteVirtual;
import com.example.dbtraductor.servicesimplements.UsuarioServiceImplement;
import com.example.dbtraductor.servicesinterfaces.IAsistenteVirtualService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/asistentesvirtuales")
public class AsistenteVirtualController {
    @Autowired
    private IAsistenteVirtualService aS;
    @Autowired
    private UsuarioServiceImplement userService;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<AsistenteVirtualDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AsistenteVirtualDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody AsistenteVirtualDto dto) {
        ModelMapper m = new ModelMapper();
        AsistenteVirtual a = m.map(dto, AsistenteVirtual.class);
        aS.insert(a);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public AsistenteVirtualDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        AsistenteVirtualDto dto = m.map(aS.searchId(id), AsistenteVirtualDto.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody AsistenteVirtualDto dto) {
        ModelMapper m = new ModelMapper();
        AsistenteVirtual a = m.map(dto, AsistenteVirtual.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}
}
