package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Escaneo;

import java.util.List;

public interface IEscaneoService {

    public List<Escaneo> list();
    public void insert (Escaneo a);
    public Escaneo searchId(int id);
    public void update (Escaneo a);
    public void delete (int id);

}
