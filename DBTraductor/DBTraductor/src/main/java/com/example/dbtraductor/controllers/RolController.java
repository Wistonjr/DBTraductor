package com.example.dbtraductor.controllers;

import com.example.dbtraductor.dtos.RolDto;
import com.example.dbtraductor.entities.Rol;
import com.example.dbtraductor.servicesinterfaces.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
@PreAuthorize("hasAuthority('ADMIN')")
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
    public void registrar(@RequestBody RolDto dto){
        ModelMapper m = new ModelMapper();
        Rol l= m.map(dto, Rol.class);
        rS.insert(l);
    }

    @PutMapping
    public void modificar(@RequestBody RolDto dto){
        ModelMapper m = new ModelMapper();
        Rol l= m.map(dto, Rol.class);
        rS.update(l);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Long id){
        rS.delete(id);
    }

//subido al main
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
