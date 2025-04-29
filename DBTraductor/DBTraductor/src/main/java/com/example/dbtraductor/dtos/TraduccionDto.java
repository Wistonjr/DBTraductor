package com.example.dbtraductor.dtos;

import java.time.LocalDate;

public class TraduccionDto {

    private int idTraduccion;

    private String lenguaje_de_programacion;

    private String originalCode;

    private String codigo_traducido;

    private LocalDate fecha_traduccion;

    public int getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(int idTraduccion) {
        this.idTraduccion = idTraduccion;
    }

    public String getLenguaje_de_programacion() {
        return lenguaje_de_programacion;
    }

    public void setLenguaje_de_programacion(String lenguaje_de_programacion) {
        this.lenguaje_de_programacion = lenguaje_de_programacion;
    }

    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode;
    }

    public String getCodigo_traducido() {
        return codigo_traducido;
    }

    public void setCodigo_traducido(String codigo_traducido) {
        this.codigo_traducido = codigo_traducido;
    }

    public LocalDate getFecha_traduccion() {
        return fecha_traduccion;
    }

    public void setFecha_traduccion(LocalDate fecha_traduccion) {
        this.fecha_traduccion = fecha_traduccion;
    }
}
