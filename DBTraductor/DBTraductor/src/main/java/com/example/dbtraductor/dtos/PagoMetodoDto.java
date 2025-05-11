package com.example.dbtraductor.dtos;

public class PagoMetodoDto {
    private float monto;
    private String metodo;

    public float getMonto() {return monto;}

    public void setMonto(float monto) {this.monto = monto;}

    public String getMetodo() {return metodo;}

    public void setMetodo(String metodo) {this.metodo = metodo;}
}
