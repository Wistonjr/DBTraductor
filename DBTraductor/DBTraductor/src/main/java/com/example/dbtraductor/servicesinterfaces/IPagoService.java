package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Pago;

import java.util.List;

public interface IPagoService {
    public List<Pago> list();
    public void insert(Pago p);
    public void update(Pago p);
    public void delete(int id);
}
