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
    private IUsuarioRepository re;

    @Override
    public List<Usuario> list() { return re.findAll();}

    @Override
    public void insert(Usuario a) {re.save(a);}

    @Override
    public Usuario searchId(int id) { return re.findById(id).orElse(new Usuario());}

    @Override
    public void update(Usuario a) {re.save(a);}

    @Override
    public void delete(int id) {re.deleteById(id);}

    @Override
    public List<String[]> RolesUsuarios() {return re.RolesUsuarios();
    }

    public int getUserIdFromUsername(String username) {
        Usuario usuario = re.findOneByUsername(username);
        return usuario != null ? usuario.getIdUsuario() : -1; // Retorna -1 si no se encuentra el usuario
    }
}
