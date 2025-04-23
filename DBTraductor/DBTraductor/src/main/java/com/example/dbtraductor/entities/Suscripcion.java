package com.example.dbtraductor.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Suscripcion")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column (name="nombreSuscripcion", nullable=false, length=20)
    private String nombreSuscripcion;
    @Column (name="estadoSuscripion", nullable=false, length=20)
    private String estadoSuscripcion;
    @Column (name="fechaInicioSuscripcion", nullable=false)
    private LocalDate fechaInicioSuscripcion;
    @Column (name="fechaFinSuscripcion", nullable=false)
    private LocalDate fechaFinSuscripcion;
    @Column (name="historialSuscripcion", nullable=false, length=20)
    private String historialSuscripcion;

    public Suscripcion(int idSuscripcion, String nombreSuscripcion, String estadoSuscripcion, LocalDate fechaInicioSuscripcion, LocalDate fechaFinSuscripcion, String historialSuscripcion) {
        this.idSuscripcion = idSuscripcion;
        this.nombreSuscripcion = nombreSuscripcion;
        this.estadoSuscripcion = estadoSuscripcion;
        this.fechaInicioSuscripcion = fechaInicioSuscripcion;
        this.fechaFinSuscripcion = fechaFinSuscripcion;
        this.historialSuscripcion = historialSuscripcion;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getNombreSuscripcion() {
        return nombreSuscripcion;
    }

    public void setNombreSuscripcion(String nombreSuscripcion) {
        this.nombreSuscripcion = nombreSuscripcion;
    }

    public String getEstadoSuscripcion() {
        return estadoSuscripcion;
    }

    public void setEstadoSuscripcion(String estadoSuscripcion) {
        this.estadoSuscripcion = estadoSuscripcion;
    }

    public LocalDate getFechaInicioSuscripcion() {
        return fechaInicioSuscripcion;
    }

    public void setFechaInicioSuscripcion(LocalDate fechaInicioSuscripcion) {
        this.fechaInicioSuscripcion = fechaInicioSuscripcion;
    }

    public LocalDate getFechaFinSuscripcion() {
        return fechaFinSuscripcion;
    }

    public void setFechaFinSuscripcion(LocalDate fechaFinSuscripcion) {
        this.fechaFinSuscripcion = fechaFinSuscripcion;
    }

    public String getHistorialSuscripcion() {
        return historialSuscripcion;
    }

    public void setHistorialSuscripcion(String historialSuscripcion) {
        this.historialSuscripcion = historialSuscripcion;
    }
}
