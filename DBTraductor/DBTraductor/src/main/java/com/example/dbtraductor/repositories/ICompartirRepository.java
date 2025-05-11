package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Compartir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompartirRepository extends JpaRepository<Compartir, Integer> {
}
