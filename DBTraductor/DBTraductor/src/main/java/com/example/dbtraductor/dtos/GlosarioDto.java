package com.example.dbtraductor.dtos;


public class GlosarioDto {
    private int idGlosario;
    private String palabra;
    private String descripcion;

    public int getIdGlosario() {
        return idGlosario;
    }

    public void setIdGlosario(int idGlosario) {
        this.idGlosario = idGlosario;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
