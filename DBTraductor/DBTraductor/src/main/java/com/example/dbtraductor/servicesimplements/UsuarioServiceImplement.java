package com.example.dbtraductor.servicesimplements;

import com.example.dbtraductor.entities.Usuario;
import com.example.dbtraductor.repositories.IUsuarioRepository;
import com.example.dbtraductor.servicesinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository Re;

    @Override
    public List<Usuario> list() { return Re.findAll();}

    @Override
    public void insert(Usuario a) {Re.save(a);}

    @Override
    public Usuario searchId(int id) { return Re.findById(id).orElse(new Usuario());}

    @Override
    public void update(Usuario a) {Re.save(a);}

    @Override
    public void delete(int id) {Re.deleteById(id);}

}
