package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
}
