package com.example.dbtraductor.controllers;
import com.example.dbtraductor.dtos.BuscarEscaneoPorFechaDto;
import com.example.dbtraductor.dtos.EscaneoDto;
import com.example.dbtraductor.entities.Escaneo;
import com.example.dbtraductor.servicesinterfaces.IEscaneoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/escaneos")
public class EscaneoController {
    @Autowired
    private IEscaneoService aS;

    @GetMapping
    public List<EscaneoDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EscaneoDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody EscaneoDto dto) {
        ModelMapper m = new ModelMapper();
        Escaneo a = m.map(dto, Escaneo.class);
        aS.insert(a);
    }

    @GetMapping("/{id}")
    public EscaneoDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        EscaneoDto dto = m.map(aS.searchId(id), EscaneoDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EscaneoDto dto) {
        ModelMapper m = new ModelMapper();
        Escaneo a = m.map(dto, Escaneo.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}

    @GetMapping("/fecha")
    public List<BuscarEscaneoPorFechaDto> buscarEscaneoPorFecha(@RequestParam LocalDate fecha) {
        return aS.findByFechaEscaneo(fecha).stream().map(p -> {
            ModelMapper m = new ModelMapper();
            return m.map(p, BuscarEscaneoPorFechaDto.class);
        }).collect(Collectors.toList());
    }
}
