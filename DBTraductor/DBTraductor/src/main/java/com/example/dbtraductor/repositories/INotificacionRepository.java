package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion, Integer> {
    @Query(value = "SELECT \n" +
            "  n.tipo,\n" +
            "  COUNT(*) AS cantidad\n" +
            " FROM notificacion AS n\n" +
            " WHERE DATE_TRUNC('month', n.fecha_envio) = DATE_TRUNC('month', CURRENT_DATE)\n" +
            " GROUP BY n.tipo\n" +
            " ORDER BY cantidad DESC;",nativeQuery = true)
    public List<String[]> TypesOfNotificationsMostSentPerMonth();
}
