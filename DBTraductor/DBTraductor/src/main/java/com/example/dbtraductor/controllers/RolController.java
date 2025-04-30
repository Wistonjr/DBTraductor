package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.RolDto;
import com.example.dbtraductor.entities.Rol;
import com.example.dbtraductor.servicesinterfaces.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
//ultimo
    @GetMapping("/usuarios")
    public List<RolDto> ListarCantidadModeradores(){
        List<String[]> filaLista=rS.QuantityModeradoresByApp();
        List<RolDto> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            RolDto dto = new RolDto();
            dto.setRolName(columna[0]);
            dto.setIdRol(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;

    }

}
