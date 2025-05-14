package com.example.dbtraductor.dtos;

import java.time.LocalDate;

public class DiezPrimerasFechasNotificacionesDto {

    private LocalDate fechaEnvio;
    private String mensaje;
    private String nombre;

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
