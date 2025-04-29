package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {
    public List<Suscripcion> list();
    public void insert(Suscripcion s);
    public void update(Suscripcion s);
    public void delete(int id);
}
