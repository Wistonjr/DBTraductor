package com.example.dbtraductor.dtos;

public class CantidadTraduccionesComparXMetodoEnvioDto {
    private String metodoEnvio;
    private int cantidadTraducciones;

    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    public int getCantidadTraducciones() {
        return cantidadTraducciones;
    }

    public void setCantidadTraducciones(int cantidadTraducciones) {
        this.cantidadTraducciones = cantidadTraducciones;
    }
}
