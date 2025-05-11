package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.Traduccion;

import java.time.LocalDate;

public class CompartirDto {
    private int idCompartir;
    private String metodoEnvio;
    private String destino;
    private LocalDate fechaEnvio;
    private String mensajeOpcional;
    private Traduccion idTraduccion;

    public int getIdCompartir() {
        return idCompartir;
    }

    public void setIdCompartir(int idCompartir) {
        this.idCompartir = idCompartir;
    }

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getMensajeOpcional() {
        return mensajeOpcional;
    }

    public void setMensajeOpcional(String mensajeOpcional) {
        this.mensajeOpcional = mensajeOpcional;
    }

    public Traduccion getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(Traduccion idTraduccion) {
        this.idTraduccion = idTraduccion;
    }
}
