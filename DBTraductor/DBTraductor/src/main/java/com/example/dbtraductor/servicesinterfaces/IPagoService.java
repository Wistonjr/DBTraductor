package com.example.dbtraductor.servicesinterfaces;
import com.example.dbtraductor.entities.Pago;

import java.util.List;

public interface IPagoService {
    public List<Pago> list();
    public void insert (Pago a);
    public Pago searchId(int id);
    public void update (Pago a);
    public void delete (int id);
    public List<String[]> getTotal();
    List<String[]> getTotalMetodo();
}
