package com.example.dbtraductor.dtos;

import java.time.LocalDate;

public class PagoRecaudacionDto {
    private float monto;
    private LocalDate fechaPago;

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }
}
