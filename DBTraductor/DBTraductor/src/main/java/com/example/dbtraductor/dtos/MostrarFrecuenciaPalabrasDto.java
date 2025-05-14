package com.example.dbtraductor.dtos;

public class MostrarFrecuenciaPalabrasDto {
    private String descripcion;
    private int cantidadPalabras;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }
}
