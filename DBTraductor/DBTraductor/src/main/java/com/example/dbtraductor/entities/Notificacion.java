package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Notificacion",uniqueConstraints = {@UniqueConstraint(columnNames = {"mensaje","tipo","fechaEnvio","leido","idUsuario"})})
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotificacion;
    @Column(name = "mensaje",nullable = false, length = 20)
    private String mensaje;
    @Column(name = "tipo",nullable = false, length = 20)
    private String tipo;
    @Column(name = "fechaEnvio",nullable = false)
    private LocalDate fechaEnvio;
    @Column(name = "leido",nullable = false)
    private Boolean leido;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario idUsuario;

    public Notificacion() {}

    public Notificacion(int idNotificacion, String mensaje, String tipo, LocalDate fechaEnvio, Boolean leido, Usuario idUsuario) {
        this.idNotificacion = idNotificacion;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.fechaEnvio = fechaEnvio;
        this.leido = leido;
        this.idUsuario = idUsuario;
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
}
