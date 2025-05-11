package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.LenguajeProgramacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILenguajeProgramacionRepository extends JpaRepository<LenguajeProgramacion, Integer> {
}
