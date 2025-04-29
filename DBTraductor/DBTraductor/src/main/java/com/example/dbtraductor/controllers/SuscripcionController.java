package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.PagoDTO;
import com.example.dbtraductor.dtos.SuscripcionDTO;
import com.example.dbtraductor.entities.Pago;
import com.example.dbtraductor.entities.Suscripcion;
import com.example.dbtraductor.servicesinterfaces.ISuscripcionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SuscripcionController {
    @Autowired
    private ISuscripcionService sS;
    @GetMapping
    public List<SuscripcionDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SuscripcionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion s = m.map(dto, Suscripcion.class);
        sS.insert(s);
    }
    @PutMapping
    public void modificar(@RequestBody SuscripcionDTO dto) {
        ModelMapper m = new ModelMapper();
        Suscripcion s = m.map(dto, Suscripcion.class);
        sS.update(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        sS.delete(id);
    }

}
