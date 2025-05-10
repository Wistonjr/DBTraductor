package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Compartir;

import java.time.LocalDate;
import java.util.List;

public interface ICompartirService {
    public List<Compartir> list();
    public void insert (Compartir c);
    public Compartir searchId(int id);
    public void update (Compartir c);
    public void delete (int id);
    public List<Compartir> buscarTraduccionesUltimomes(LocalDate fecha);
    public List<String[]> cantidadTraduccionesCompartidasXMetodoEnvio();
}
