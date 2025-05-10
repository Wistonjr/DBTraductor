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

    @Query(value = "SELECT \n" +
            "    lp.nombre AS lenguaje_programacion, \n" +
            "    COUNT(t.id_traduccion) AS total_traducciones \n" +
            " FROM \n" +
            "    Traduccion t\n" +
            " JOIN \n" +
            "    Lenguaje_Programacion lp ON t.id_lenguaje_programacion = lp.id_lenguaje_programacion \n" +
            "    lp.nombre  \n" +
            " ORDER BY \n" +
            "    total_traducciones DESC \n" +
            "LIMIT 1; ",nativeQuery = true)
    public List<String[]> buscarLenguajeFrecuente();
}
