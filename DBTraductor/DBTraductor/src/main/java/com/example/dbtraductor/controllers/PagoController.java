package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.PagoDTO;
import com.example.dbtraductor.servicesinterfaces.IPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService pS;

    public List<PagoDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PagoDTO.class);
        }).collect(Collectors.toList());
    }
}
