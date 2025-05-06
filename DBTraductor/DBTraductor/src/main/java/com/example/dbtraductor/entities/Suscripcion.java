package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="suscripcion")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;
    @Column(name="tipo", nullable=false,length=20)
    private String tipo;
    @Column(name="estado", nullable=false,length=20)
    private String estado;
    @Column(name="fechaInicio", nullable=false)
    private LocalDate fechaInicio;
    @Column(name="fechaFin", nullable=false)
    private LocalDate fechaFin;
    @Column(name="historial", nullable=false,length=50)
    private String historial;
    @ManyToOne
    @JoinColumn(name ="idUsuario")
    private Usuario idUsuario;

    public Suscripcion(int idSuscripcion, String tipo, String estado, LocalDate fechaInicio, LocalDate fechaFin, String historial, Usuario idUsuario) {
        this.idSuscripcion = idSuscripcion;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.historial = historial;
        this.idUsuario = idUsuario;
    }

    public Suscripcion() {

    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}
