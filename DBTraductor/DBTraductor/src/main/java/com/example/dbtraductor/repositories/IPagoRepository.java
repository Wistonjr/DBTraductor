package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPagoRepository extends JpaRepository<Pago, Integer> {
}
