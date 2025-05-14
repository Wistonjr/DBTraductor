package com.example.dbtraductor.controllers;
import com.example.dbtraductor.dtos.PagoDto;
import com.example.dbtraductor.dtos.PagoMetodoDto;
import com.example.dbtraductor.dtos.PagoRecaudacionDto;
import com.example.dbtraductor.entities.Pago;
import com.example.dbtraductor.servicesinterfaces.IPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService aS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PagoDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PagoDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody PagoDto dto) {
        ModelMapper m = new ModelMapper();
        Pago a = m.map(dto, Pago.class);
        aS.insert(a);
    }

    /*search id */
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public PagoDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        PagoDto dto = m.map(aS.searchId(id), PagoDto.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody PagoDto dto) {
        ModelMapper m = new ModelMapper();
        Pago a = m.map(dto, Pago.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}

    @GetMapping("/recaudaciones/{fecha}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PagoRecaudacionDto> listarRecaudacion(@PathVariable("fecha") String fecha) {
        List<String[]> filaLista = aS.getTotal();
        List<PagoRecaudacionDto> dtoLista = new ArrayList<>();
        LocalDate fechaBusqueda = LocalDate.parse(fecha);
        for (String[] columna : filaLista) {
            LocalDate fechaPago = LocalDate.parse(columna[0]);
            if (fechaPago.equals(fechaBusqueda)) {
                PagoRecaudacionDto dto = new PagoRecaudacionDto();
                dto.setFechaPago(fechaPago);
                dto.setMonto(Float.parseFloat(columna[1]));
                dtoLista.add(dto);
            }
        }
        return dtoLista;
    }
    @GetMapping("/metodos")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PagoMetodoDto> listarmetodosmonto(){
        List<String[]> filaLista=aS.getTotalMetodo();
        List<PagoMetodoDto> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            PagoMetodoDto dto=new PagoMetodoDto();
            dto.setMetodo(columna[0]);
            dto.setMonto(Float.parseFloat(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
