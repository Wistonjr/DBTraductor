package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Glosario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGlosarioRepository extends JpaRepository<Glosario, Integer> {
}
