package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.AsistenteVirtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAsistenteVirtualRepository extends JpaRepository<AsistenteVirtual, Integer> {
}
