package com.example.dbtraductor.servicesinterfaces;


import com.example.dbtraductor.entities.Rol;

import java.util.List;

public interface IRolService {
public List<Rol> list();
public void insert(Rol r);
public void update(Rol r);
public void delete(Long id);
public List<String[]> QuantityModeradoresByApp();
}
