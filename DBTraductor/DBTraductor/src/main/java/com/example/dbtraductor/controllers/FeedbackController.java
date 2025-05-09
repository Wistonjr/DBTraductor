package com.example.dbtraductor.controllers;
import com.example.dbtraductor.dtos.FeedBackDto;
import com.example.dbtraductor.entities.FeedBack;
import com.example.dbtraductor.servicesinterfaces.IFeedBackService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {
    @Autowired
    private IFeedBackService aS;

    @GetMapping
    public List<FeedBackDto> listar() {
        return aS.list().stream().map( x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, FeedBackDto.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody FeedBackDto dto) {
        ModelMapper m = new ModelMapper();
        FeedBack a = m.map(dto, FeedBack.class);
        aS.insert(a);
    }

    @GetMapping("/{id}")
    public FeedBackDto listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        FeedBackDto dto = m.map(aS.searchId(id), FeedBackDto.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody FeedBackDto dto) {
        ModelMapper m = new ModelMapper();
        FeedBack a = m.map(dto, FeedBack.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {aS.delete(id);}
}
