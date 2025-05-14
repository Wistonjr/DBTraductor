package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.repositories.ITraduccionRepository;
import com.example.dbtraductor.servicesinterfaces.ITraduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraduccionServiceImplement implements ITraduccionService {

    @Autowired
    private ITraduccionRepository re;

    @Override
    public List<Traduccion> list() {
        return re.findAll();
    }

    @Override
    public void insert(Traduccion a) {
        re.save(a);
    }

    @Override
    public Traduccion searchId(int id) {
        return re.findById(id).orElse(new Traduccion());
    }

    @Override
    public void update(Traduccion a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
    @Override
    public List<String[]> mostrarTraduccionesHoy(){return re.mostrarTraduccionesHoy();}
}
