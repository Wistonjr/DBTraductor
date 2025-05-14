package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.DiezPrimerasFechasNotificacionesDto;
import com.example.dbtraductor.dtos.NotificacionDto;
import com.example.dbtraductor.entities.Notificacion;
import com.example.dbtraductor.servicesinterfaces.INotificacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {
    @Autowired
    private INotificacionService nS;
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<NotificacionDto> listar() {
        return nS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificacionDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody NotificacionDto dto) {
        ModelMapper m = new ModelMapper();
        Notificacion c = m.map(dto, Notificacion.class);
        nS.insert(c);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public NotificacionDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        NotificacionDto dto = m.map(nS.searchId(id), NotificacionDto.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody NotificacionDto dto) {
        ModelMapper m = new ModelMapper();
        Notificacion c = m.map(dto, Notificacion.class);
        nS.update(c);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {nS.delete(id);}


    @GetMapping("/diezprimerasfechas")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DiezPrimerasFechasNotificacionesDto> ListarCantidadModeradores(){
        List<String[]> filaLista=nS.DiezprimerasnoficacionesByApp();
        List<DiezPrimerasFechasNotificacionesDto> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            DiezPrimerasFechasNotificacionesDto dto = new DiezPrimerasFechasNotificacionesDto();
            dto.setFechaEnvio(LocalDate.parse(columna[0]));
            dto.setNombre((columna[1]));
            dto.setMensaje((columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;

    }


}
