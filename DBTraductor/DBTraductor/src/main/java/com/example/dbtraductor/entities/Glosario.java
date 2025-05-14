package com.example.dbtraductor.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Glosario")
public class Glosario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGlosario;
    @Column(name = "palabra", nullable = false, length = 40)
    private String palabra;
    @Column(name = "descripcion", nullable = false, length = 400)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name ="idTraduccion")
    private Traduccion idTraduccion;

    public Glosario() {}

    public Glosario(int idGlosario, String palabra, String descripcion, Traduccion idTraduccion) {
        this.idGlosario = idGlosario;
        this.palabra = palabra;
        this.descripcion = descripcion;
        this.idTraduccion = idTraduccion;
    }

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

    public Traduccion getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(Traduccion idTraduccion) {
        this.idTraduccion = idTraduccion;
    }
}
