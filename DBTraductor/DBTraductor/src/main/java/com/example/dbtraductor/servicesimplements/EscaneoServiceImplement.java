package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Escaneo;
import com.example.dbtraductor.repositories.IEscaneoRepository;
import com.example.dbtraductor.servicesinterfaces.IEscaneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscaneoServiceImplement implements IEscaneoService {

    @Autowired
    private IEscaneoRepository re;

    @Override
    public List<Escaneo> list() {
        return re.findAll();
    }

    @Override
    public void insert(Escaneo a) {
        re.save(a);
    }

    @Override
    public Escaneo searchId(int id) {
        return re.findById(id).orElse(new Escaneo());
    }

    @Override
    public void update(Escaneo a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
}
