package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Compartir;
import com.example.dbtraductor.entities.Escaneo;
import com.example.dbtraductor.repositories.ICompartirRepository;
import com.example.dbtraductor.repositories.IEscaneoRepository;
import com.example.dbtraductor.servicesinterfaces.ICompartirService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class CompartirServiceImplement implements ICompartirService {
    private ICompartirRepository re;

    @Override
    public List<Compartir> list() {
        return re.findAll();
    }

    @Override
    public void insert(Compartir c) {
        re.save(c);
    }

    @Override
    public Compartir searchId(int id) {
        return re.findById(id).orElse(new Compartir());
    }

    @Override
    public void update(Compartir c) {
        re.save(c);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
}
