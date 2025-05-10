package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.LenguajeProgramacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILenguajeProgramacionRepository extends JpaRepository<LenguajeProgramacion, Integer> {
    @Query(value = "SELECT lp.tipo, COUNT(*) AS cantidad_lenguajes\n" +
            " FROM Lenguaje_Programacion lp\n" +
            " GROUP BY lp.tipo\n" +
            " HAVING COUNT(*) > 10;",nativeQuery = true)
    public List<String[]> conteoConMasDiezLenguajes();

    @Query(value = "SELECT " +
            "    lp.nombre AS lenguaje_programacion, " +
            "    COUNT(t.id_traduccion) AS total_traducciones " +
            " FROM " +
            "    Traduccion t " +
            " JOIN " +
            "    Lenguaje_Programacion lp ON t.id_lenguaje_programacion = lp.id_lenguaje_programacion " +
            " GROUP BY " +
            "    lp.nombre " +  // Es importante agrupar por lp.nombre
            " ORDER BY " +
            "    total_traducciones DESC " +
            " LIMIT 1", nativeQuery = true)
    public List<String[]> buscarLenguajeFrecuente();
}
