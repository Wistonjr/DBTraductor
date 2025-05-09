package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Traduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITraduccionRepository extends JpaRepository<Traduccion, Integer> {
}
