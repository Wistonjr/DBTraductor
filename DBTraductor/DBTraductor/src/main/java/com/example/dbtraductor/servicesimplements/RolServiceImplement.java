package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Rol;
import com.example.dbtraductor.repositories.IRolRepository;
import com.example.dbtraductor.servicesinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository re;

    @Override
    public List<Rol> list() { return re.findAll();}

    @Override
    public void insert(Rol rol) {re.save(rol);
    }
}
