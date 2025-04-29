package com.example.dbtraductor.dtos;
import java.time.LocalDate;

public class SuscripcionDTO {
    private int idSuscripcion;
    private String nombreSuscripcion;
    private String estadoSuscripcion;
    private LocalDate fechaInicioSuscripcion;
    private LocalDate fechaFinSuscripcion;
    private String historialSuscripcion;

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
