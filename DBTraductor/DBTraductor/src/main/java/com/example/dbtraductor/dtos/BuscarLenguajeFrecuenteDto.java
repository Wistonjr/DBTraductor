package com.example.dbtraductor.dtos;

public class BuscarLenguajeFrecuenteDto {
    private String nombre;
    private int totalTraducciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalTraducciones() {
        return totalTraducciones;
    }

    public void setTotalTraducciones(int totalTraducciones) {
        this.totalTraducciones = totalTraducciones;
    }
}
