package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Glosario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGlosarioRepository extends JpaRepository<Glosario, Integer> {
    @Query(value = "SELECT g.descripcion, COUNT(*) AS cantidad_palabras\n" +
            " FROM Glosario g\n" +
            " GROUP BY g.descripcion\n" +
            " HAVING COUNT(*) > 1\n" +
            " ORDER BY cantidad_palabras DESC;",nativeQuery = true)
    public List<String[]> frecuenciaPalabrasGlosario();

    @Query(value = "SELECT g.descripcion, COUNT(t.id_traduccion) AS cantidad_traducciones\n" +
            " FROM Glosario g\n" +
            " LEFT JOIN Traduccion t ON g.id_traduccion = t.id_traduccion\n" +
            " GROUP BY g.descripcion\n" +
            " HAVING COUNT(t.id_traduccion) > 0;",nativeQuery = true)
    public List<String[]> conteoTraduccionYPalabrasPorDescripcion();
}
