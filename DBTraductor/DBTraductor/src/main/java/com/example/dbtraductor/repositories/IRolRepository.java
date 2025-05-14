package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Long> {
    @Query(value ="select r.rol_name,count(u.id_rol)\n" +
            " from usuario u inner join rol r\n" +
            " on u.id_rol =r.id_rol\n" +
            " where u.id_rol::text like '2'\n" +
            " group by r.rol_name",nativeQuery=true)
    public List<String[]> QuantityModeradoresByApp();

    Integer idRol(Long idRol);
}
