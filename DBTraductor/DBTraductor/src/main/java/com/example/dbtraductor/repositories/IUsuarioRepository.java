package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query(value="select u.nombre,r.rol_name\n" +
            " from usuario u  inner join rol r\n" +
            " on u.id_rol =r.id_rol",nativeQuery=true)

    public List<String[]> RolesUsuarios();
}
