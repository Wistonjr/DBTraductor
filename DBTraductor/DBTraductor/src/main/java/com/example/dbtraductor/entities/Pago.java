package com.example.dbtraductor.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column (name="montoPago", nullable=false)
    private double montoPago;
    @Column (name="metodoPago", nullable=false, length=10)
    private String metodoPago;
    @Column (name="fechaPago", nullable=false)
    private LocalDate fechaPago;
    @Column (name="estadoPago", nullable=false, length=15)
    private String estadoPago;

    public Pago(int idPago, double montoPago, String metodoPago, LocalDate fechaPago, String estadoPago) {
        this.idPago = idPago;
        this.montoPago = montoPago;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;
    }

    public Pago() {

    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}
