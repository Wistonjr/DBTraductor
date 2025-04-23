package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Traduccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITraduccionRepository extends JpaRepository<Traduccion, Integer> {
}
