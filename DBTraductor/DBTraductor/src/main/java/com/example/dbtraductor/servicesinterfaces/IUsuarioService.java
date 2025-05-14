package com.example.dbtraductor.servicesinterfaces;

import com.example.dbtraductor.entities.Usuario;

import java.util.List;

public interface IUsuarioService{
    public List<Usuario> list();
    public void insert (Usuario a);
    public Usuario searchId(int id);
    public void update (Usuario a);
    public void delete (int id);
    public List<String[]> RolesUsuarios();
    public int getUserIdFromUsername(String username);
}
