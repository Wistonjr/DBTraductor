package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Traduccion")
public class Traduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTraduccion;

    @Column(name = "lenguaje_de_programacion", nullable = false )
    private String lenguaje_de_programacion;

    @Column(name = "originalCode", nullable = false )
    private String originalCode;

    @Column(name = "codigo_traducido", nullable = false )
    private String codigo_traducido;

    @Column(name = "fecha_traduccion", nullable = false )
    private LocalDate fecha_traduccion;

    public Traduccion(int idTraduccion, String lenguaje_de_programacion, String originalCode, String codigo_traducido, LocalDate fecha_traduccion) {
        this.idTraduccion = idTraduccion;
        this.lenguaje_de_programacion = lenguaje_de_programacion;
        this.originalCode = originalCode;
        this.codigo_traducido = codigo_traducido;
        this.fecha_traduccion = fecha_traduccion;
    }

    public Traduccion() {
    }

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
