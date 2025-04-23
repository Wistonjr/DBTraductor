package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Escaneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEscaneoRepository extends JpaRepository<Escaneo, Integer> {
}
