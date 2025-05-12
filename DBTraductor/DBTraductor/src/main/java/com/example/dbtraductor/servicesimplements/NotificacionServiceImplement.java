package com.example.dbtraductor.servicesimplements;
import com.example.dbtraductor.entities.Notificacion;
import com.example.dbtraductor.repositories.INotificacionRepository;
import com.example.dbtraductor.servicesinterfaces.INotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionServiceImplement implements INotificacionService {
    @Autowired
    private INotificacionRepository nR;

    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void insert(Notificacion n) {
        nR.save(n);
    }

    @Override
    public Notificacion searchId(int id) {
        return nR.findById(id).orElse(new Notificacion());
    }

    @Override
    public void update(Notificacion n) {
        nR.save(n);
    }

    @Override
    public void delete(int id) {
        nR.deleteById(id);
    }

    @Override
    public List<String[]> TypesOfNotificationsMostSentPerMonth() {
        return nR.TypesOfNotificationsMostSentPerMonth();
    }
}
