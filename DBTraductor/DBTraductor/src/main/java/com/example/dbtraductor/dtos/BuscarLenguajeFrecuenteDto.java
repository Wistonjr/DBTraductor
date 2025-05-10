package com.example.dbtraductor.dtos;

public class BuscarLenguajeFrecuenteDto {
    private String nombre;
    private String totalTraducciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTotalTraducciones() {
        return totalTraducciones;
    }

    public void setTotalTraducciones(String totalTraducciones) {
        this.totalTraducciones = totalTraducciones;
    }
}
