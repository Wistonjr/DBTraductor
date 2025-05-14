package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Traduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITraduccionRepository extends JpaRepository<Traduccion, Integer> {
    @Query(value = "SELECT * \n" +
            "FROM Traduccion\n" +
            "WHERE fecha_traduccion::DATE = CURRENT_DATE\n" +
            "ORDER BY fecha_traduccion DESC;",nativeQuery = true)
    public List<String[]> mostrarTraduccionesHoy();

}
