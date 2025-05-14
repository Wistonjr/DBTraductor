package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Escaneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IEscaneoRepository extends JpaRepository<Escaneo, Integer> {
    @Query(value = "SELECT * \n" +
            "FROM Escaneo\n" +
            "WHERE fecha_escaneo::DATE BETWEEN '2025-01-01' AND CURRENT_DATE;",nativeQuery = true)
    public List<Escaneo> findByFechaEscaneo(LocalDate fecha);
}
