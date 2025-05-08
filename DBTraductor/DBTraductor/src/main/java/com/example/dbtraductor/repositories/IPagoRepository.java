package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query(value = "SELECT fecha_pago, SUM(monto) AS recaudacion_total" +
            " FROM pago" +
            " GROUP BY fecha_pago" +
            " ORDER BY fecha_pago", nativeQuery = true)
    List<String[]> getTotal();
}

