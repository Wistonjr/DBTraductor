package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Pago;
import com.example.dbtraductor.repositories.IPagoRepository;
import com.example.dbtraductor.servicesinterfaces.IPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class PagoServiceImplement implements IPagoService {

    @Autowired
    private IPagoRepository re;

    @Override
    public List<Pago> list() {
        return re.findAll();
    }

    @Override
    public void insert(Pago a) {
        re.save(a);
    }

    @Override
    public Pago searchId(int id) {
        return re.findById(id).orElse(new Pago());
    }

    @Override
    public void update(Pago a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }

    @Override
    public List<String[]> getTotal() {
        return re.getTotal();
    }

}
