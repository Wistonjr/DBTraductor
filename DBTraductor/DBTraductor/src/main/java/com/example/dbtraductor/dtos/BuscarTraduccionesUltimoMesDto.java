package com.example.dbtraductor.dtos;

import java.time.LocalDate;

public class BuscarTraduccionesUltimoMesDto {
    private int idTraduccion;
    private String metodoEnvio;
    private LocalDate fechaEnvio;

    public int getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(int idTraduccion) {
        this.idTraduccion = idTraduccion;
    }

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}
