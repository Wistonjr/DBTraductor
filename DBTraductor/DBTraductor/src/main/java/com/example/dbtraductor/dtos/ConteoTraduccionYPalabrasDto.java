package com.example.dbtraductor.dtos;

public class ConteoTraduccionYPalabrasDto {
    private String descripcion;
    private String cantidadTraducciones;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidadTraducciones() {
        return cantidadTraducciones;
    }

    public void setCantidadTraducciones(String cantidadTraducciones) {
        this.cantidadTraducciones = cantidadTraducciones;
    }
}
