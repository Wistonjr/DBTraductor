package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Glosario;
import com.example.dbtraductor.repositories.IGlosarioRepository;
import com.example.dbtraductor.servicesinterfaces.IGlosarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GlosarioServiceImplement implements IGlosarioService {

    @Autowired
    private IGlosarioRepository re;

    @Override
    public List<Glosario> list() {
        return re.findAll();
    }

    @Override
    public void insert(Glosario a) {
        re.save(a);
    }

    @Override
    public Glosario searchId(int id) {
        return re.findById(id).orElse(new Glosario());
    }

    @Override
    public void update(Glosario a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
}
