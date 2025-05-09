package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Glosario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGlosarioRepository extends JpaRepository<Glosario, Integer> {
}
