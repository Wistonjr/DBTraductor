package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name="monto", nullable=false,length=20)
    private float monto;
    @Column(name="metodo", nullable=false,length=30)
    private String metodo;
    @Column(name="fechaPago", nullable=false)
    private LocalDate fechaPago;
    @Column(name="estado", nullable=false,length=20)
    private String estado;
    @ManyToOne
    @JoinColumn(name ="idSuscripcion")
    private Suscripcion idSuscripcion;

    public Pago(int idPago, float monto, String metodo, LocalDate fechaPago, String estado, Suscripcion idSuscripcion) {
        this.idPago = idPago;
        this.monto = monto;
        this.metodo = metodo;
        this.fechaPago = fechaPago;
        this.estado = estado;
        this.idSuscripcion = idSuscripcion;
    }

    public Pago() {

    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Suscripcion getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(Suscripcion idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }
}
