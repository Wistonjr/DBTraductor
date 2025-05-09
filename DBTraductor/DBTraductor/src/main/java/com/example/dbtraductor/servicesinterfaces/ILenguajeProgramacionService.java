package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Compartir;
import com.example.dbtraductor.entities.LenguajeProgramacion;

import java.util.List;

public interface ILenguajeProgramacionService {
    public List<LenguajeProgramacion> list();
    public void insert (LenguajeProgramacion l);
    public LenguajeProgramacion searchId(int id);
    public void update (LenguajeProgramacion l);
    public void delete (int id);
}
