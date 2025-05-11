package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Traduccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ITraduccionRepository extends JpaRepository<Traduccion, Integer> {
    @Query(value = "SELECT lenguaje_programacion, COUNT(*) AS total FROM Traduccion GROUP BY lenguaje_programacion ORDER BY total DESC LIMIT 1", nativeQuery = true)
    static Object findMostTranslatedLanguage() {
        return null;
    }
    /* Lenguaje más usado en traducciones */
}
