package com.example.dbtraductor.servicesinterfaces;
import com.example.dbtraductor.entities.Glosario;

import java.util.List;

public interface IGlosarioService {
    public List<Glosario> list();
    public void insert (Glosario a);
    public Glosario searchId(int id);
    public void update (Glosario a);
    public void delete (int id);
}
