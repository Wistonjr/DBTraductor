package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Pago;
import com.example.dbtraductor.repositories.IPagoRepository;
import com.example.dbtraductor.servicesinterfaces.IPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository pR;

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }
}
