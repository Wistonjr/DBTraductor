package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.LenguajeProgramacion;
import com.example.dbtraductor.repositories.ILenguajeProgramacionRepository;
import com.example.dbtraductor.servicesinterfaces.ILenguajeProgramacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LenguajeProgramacionServiceImplement implements ILenguajeProgramacionService {
    @Autowired
    private ILenguajeProgramacionRepository lp;

    @Override
    public List<LenguajeProgramacion> list() {
        return lp.findAll();
    }

    @Override
    public void insert(LenguajeProgramacion l) {
        lp.save(l);
    }

    @Override
    public LenguajeProgramacion searchId(int id) {
        return lp.findById(id).orElse(new LenguajeProgramacion());
    }

    @Override
    public void update(LenguajeProgramacion l) {
        lp.save(l);
    }

    @Override
    public void delete(int id) {
        lp.deleteById(id);
    }
    @Override
    public List<String[]> conteoConMasDiezLenguajes(){return lp.conteoConMasDiezLenguajes();}
    @Override
    public List<String[]> buscarLenguajeFrecuente(){return lp.buscarLenguajeFrecuente();}
}
