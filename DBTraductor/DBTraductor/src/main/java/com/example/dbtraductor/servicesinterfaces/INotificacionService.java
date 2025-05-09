package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Compartir;
import com.example.dbtraductor.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();
    public void insert (Notificacion n);
    public Notificacion searchId(int id);
    public void update (Notificacion n);
    public void delete (int id);
}
