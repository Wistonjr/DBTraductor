package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Compartir")
public class Compartir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompartir;
    @Column(name = "metodoEnvio",nullable = false,length = 50)
    private String metodoEnvio;
    @Column(name = "destino",nullable = false,length = 50)
    private String destino;
    @Column(name = "fechaEnvio",nullable = false)
    private LocalDate fechaEnvio;
    @Column(name = "mensajeOpcional",nullable = false,length = 100)
    private String mensajeOpcional;
    @ManyToOne
    @JoinColumn (name = "idTraduccion")
    private Traduccion idTraduccion;

    public Compartir() {}

    public Compartir(int idCompartir, String metodoEnvio, String destino, LocalDate fechaEnvio, String mensajeOpcional, Traduccion idTraduccion) {
        this.idCompartir = idCompartir;
        this.metodoEnvio = metodoEnvio;
        this.destino = destino;
        this.fechaEnvio = fechaEnvio;
        this.mensajeOpcional = mensajeOpcional;
        this.idTraduccion = idTraduccion;
    }

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
