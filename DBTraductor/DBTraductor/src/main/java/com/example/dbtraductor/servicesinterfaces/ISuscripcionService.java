package com.example.dbtraductor.servicesinterfaces;
import com.example.dbtraductor.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionService {
    public List<Suscripcion> list();
    public void insert (Suscripcion a);
    public Suscripcion searchId(int id);
    public void update (Suscripcion a);
    public void delete (int id);
}
