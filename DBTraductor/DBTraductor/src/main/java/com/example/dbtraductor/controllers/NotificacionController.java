package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.NotificacionDto;
import com.example.dbtraductor.entities.Notificacion;
import com.example.dbtraductor.servicesinterfaces.INotificacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {
    @Autowired
    private INotificacionService nS;
    @GetMapping
    public List<NotificacionDto> listar() {
        return nS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificacionDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody NotificacionDto dto) {
        ModelMapper m = new ModelMapper();
        Notificacion c = m.map(dto, Notificacion.class);
        nS.insert(c);
    }

    @GetMapping("/{id}")
    public NotificacionDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        NotificacionDto dto = m.map(nS.searchId(id), NotificacionDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody NotificacionDto dto) {
        ModelMapper m = new ModelMapper();
        Notificacion c = m.map(dto, Notificacion.class);
        nS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {nS.delete(id);}
}
