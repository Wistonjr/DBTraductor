package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.repositories.ITraduccionRepository;
import com.example.dbtraductor.servicesinterfaces.ITraduccionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraduccionServiceImplement implements ITraduccionService {


    @Override
    public List<Traduccion> list() {
        return List.of();
    }

    @Override
    public void insert(Traduccion a) {

    }

    @Override
    public Traduccion search(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Traduccion a) {

    }

    public Object getMostTranslatedLanguage() {
        return ITraduccionRepository.findMostTranslatedLanguage();
    }

}
