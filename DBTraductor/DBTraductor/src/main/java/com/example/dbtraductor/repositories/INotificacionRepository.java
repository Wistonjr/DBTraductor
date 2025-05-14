package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion, Integer> {

    @Query(value =" SELECT n.fecha_envio,u.nombre,n.mensaje\n" +
            " FROM notificacion n inner join  usuario u \n" +
            " on n.id_usuario=u.id_usuario   \n" +
            " where n.fecha_envio\n" +
            " between '2020-01-01' and '2020-01-10' ",nativeQuery = true)
    public List<String[]> DiezprimerasnoficacionesByApp();
}
