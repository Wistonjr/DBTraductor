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
    private ISuscripcionRepository re;

    @Override
    public List<Suscripcion> list() {
        return re.findAll();
    }

    @Override
    public void insert(Suscripcion a) {
        re.save(a);
    }

    @Override
    public Suscripcion searchId(int id) {
        return re.findById(id).orElse(new Suscripcion());
    }

    @Override
    public void update(Suscripcion a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
}
