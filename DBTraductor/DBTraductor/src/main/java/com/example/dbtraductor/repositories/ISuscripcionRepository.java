package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
}
