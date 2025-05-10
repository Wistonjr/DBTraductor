package com.example.dbtraductor.repositories;

import com.example.dbtraductor.entities.Compartir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ICompartirRepository extends JpaRepository<Compartir, Integer> {
    @Query(value = "SELECT c FROM Compartir c WHERE c.fechaEnvio >= :fechaInicio AND c.fechaEnvio < :fechaFin")
    public List<String[]> buscarTraduccionesUltimomes(LocalDate fechaInicio, LocalDate fechaFin);

    @Query(value = "SELECT c.metodo_envio, COUNT(*) AS cantidad_traducciones\n" +
            " FROM Compartir c\n" +
            " GROUP BY c.metodo_envio;",nativeQuery = true)
    public List<String[]> cantidadTraduccionesCompartidasXMetodoEnvio();

}
