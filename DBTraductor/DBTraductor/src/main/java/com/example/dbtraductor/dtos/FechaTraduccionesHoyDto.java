package com.example.dbtraductor.dtos;

import java.time.LocalDate;

public class FechaTraduccionesHoyDto {
    private int idTraduccion;
    private LocalDate fechaTraduccion;

    public int getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(int idTraduccion) {
        this.idTraduccion = idTraduccion;
    }

    public LocalDate getFechaTraduccion() {
        return fechaTraduccion;
    }

    public void setFechaTraduccion(LocalDate fechaTraduccion) {
        this.fechaTraduccion = fechaTraduccion;
    }
}
