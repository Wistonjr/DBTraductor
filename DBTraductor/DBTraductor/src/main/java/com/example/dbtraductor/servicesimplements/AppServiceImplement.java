package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.App;
import com.example.dbtraductor.repositories.IAppRepository;
import com.example.dbtraductor.servicesinterfaces.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImplement implements IAppService {
    @Autowired
    private IAppRepository Re;

    @Override
    public List<App> list() { return Re.findAll();}

    @Override
    public void insert(App a) {Re.save(a);}

    @Override
    public App searchId(int id) { return Re.findById(id).orElse(new App());}

    @Override
    public void update(App a) {Re.save(a);}

    @Override
    public void delete(int id) {Re.deleteById(id);}
}

