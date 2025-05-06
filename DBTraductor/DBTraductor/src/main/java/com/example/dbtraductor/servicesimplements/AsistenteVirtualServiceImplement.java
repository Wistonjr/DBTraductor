package com.example.dbtraductor.servicesimplements;
import com.example.dbtraductor.entities.AsistenteVirtual;
import com.example.dbtraductor.repositories.IAsistenteVirtualRepository;
import com.example.dbtraductor.servicesinterfaces.IAsistenteVirtualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenteVirtualServiceImplement implements IAsistenteVirtualService {
    @Autowired
    private IAsistenteVirtualRepository re;

    @Override
    public List<AsistenteVirtual> list() {
        return re.findAll();
    }

    @Override
    public void insert(AsistenteVirtual a) {
        re.save(a);
    }

    @Override
    public AsistenteVirtual searchId(int id) {
        return re.findById(id).orElse(new AsistenteVirtual());
    }

    @Override
    public void update(AsistenteVirtual a) {
        re.save(a);
    }

    @Override
    public void delete(int id) {
        re.deleteById(id);
    }
}
