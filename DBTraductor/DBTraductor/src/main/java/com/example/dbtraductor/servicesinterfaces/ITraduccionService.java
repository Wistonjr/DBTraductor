package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Traduccion;

import java.util.List;

public interface ITraduccionService {

    public List<Traduccion> list();
    public void insert (Traduccion a);
    public Traduccion search(int id);
    public void delete(int id);
    public void update (Traduccion a);
}
