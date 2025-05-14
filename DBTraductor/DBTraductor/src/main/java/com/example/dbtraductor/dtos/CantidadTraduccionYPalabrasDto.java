package com.example.dbtraductor.dtos;

public class CantidadTraduccionYPalabrasDto {
    private String descripcion;
    private int cantidadTraducciones;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadTraducciones() {
        return cantidadTraducciones;
    }

    public void setCantidadTraducciones(int cantidadTraducciones) {
        this.cantidadTraducciones = cantidadTraducciones;
    }
}
