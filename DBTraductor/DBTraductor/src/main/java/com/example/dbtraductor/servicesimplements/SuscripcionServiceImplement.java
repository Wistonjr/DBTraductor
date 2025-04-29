package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Suscripcion;
import com.example.dbtraductor.repositories.ISuscripcionRepository;
import com.example.dbtraductor.servicesinterfaces.ISuscripcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuscripcionServiceImplement implements ISuscripcionService {
    @Autowired
    private ISuscripcionRepository sR;

    @Override
    public List<Suscripcion> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Suscripcion s) {
        sR.save(s);
    }

    @Override
    public void update(Suscripcion s) {
        sR.save(s);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }
}
