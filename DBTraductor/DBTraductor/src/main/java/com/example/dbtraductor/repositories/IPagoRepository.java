package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    @Query(value = "SELECT fecha_pago, SUM(monto) AS recaudacion_total" +
            " FROM pago" +
            " GROUP BY fecha_pago" +
            " ORDER BY fecha_pago", nativeQuery = true)
    List<String[]> getTotal();
    @Query(value = "SELECT metodo, SUM(monto) AS recaudacion_total" +
            " FROM pago" +
            " GROUP BY metodo" +
            " ORDER BY recaudacion_total DESC", nativeQuery = true)
    List<String[]> getTotalMetodo();
}
