package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Escaneo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEscaneoRepository extends JpaRepository<Escaneo, Integer> {
    @Query(value = "SELECT lenguaje_origen FROM escaneo GROUP BY lenguaje_origen ORDER BY COUNT(*) DESC LIMIT 1", nativeQuery = true)
    Object findMostScannedLanguage();
}

/**
 * Devuelve el ID de la app que fue más escaneada.
 * Agrupa por app y cuenta cuántos escaneos tiene cada una.
 * Sirve para saber cuál se revisa más seguido.
 * "Código fuente más escaneado por lenguaje"
 */
