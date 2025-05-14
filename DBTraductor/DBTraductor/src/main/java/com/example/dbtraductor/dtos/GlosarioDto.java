package com.example.dbtraductor.dtos;


import com.example.dbtraductor.entities.Traduccion;

public class GlosarioDto {
    private int idGlosario;
    private String descripcion;
    private String palabra;
    private Traduccion idTraduccion;

    public int getIdGlosario() {
        return idGlosario;
    }

    public void setIdGlosario(int idGlosario) {
        this.idGlosario = idGlosario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Traduccion getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(Traduccion idTraduccion) {
        this.idTraduccion = idTraduccion;
    }
}
