package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.AsistenteVirtualDto;
import com.example.dbtraductor.entities.AsistenteVirtual;
import com.example.dbtraductor.servicesinterfaces.IAsistenteVirtualService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/asistentesvirtuales")
public class AsistenteVirtualController {
    @Autowired
    private IAsistenteVirtualService aS;
//a
    @GetMapping
    public List<AsistenteVirtualDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AsistenteVirtualDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody AsistenteVirtualDto dto) {
        ModelMapper m = new ModelMapper();
        AsistenteVirtual a = m.map(dto, AsistenteVirtual.class);
        aS.insert(a);
    }

    @GetMapping("/{id}")
    public AsistenteVirtualDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        AsistenteVirtualDto dto = m.map(aS.searchId(id), AsistenteVirtualDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody AsistenteVirtualDto dto) {
        ModelMapper m = new ModelMapper();
        AsistenteVirtual a = m.map(dto, AsistenteVirtual.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}
}
