package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.AsistenteVirtual;

import java.util.List;

public interface IAsistenteVirtualService {
    public List<AsistenteVirtual> list();
    public void insert (AsistenteVirtual a);
    public AsistenteVirtual searchId(int id);
    public void update (AsistenteVirtual a);
    public void delete (int id);
}
