package com.example.dbtraductor.entities;

import jakarta.persistence.*;

@Entity
@Table(name="AsistenteVirtual")
public class AsistenteVirtual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsistenteVirtual;
    @Column(name = "nombre", nullable = false, length = 35)
    private String nombre;
    @Column(name = "version", nullable = false, length = 10)
    private String version;
    @Column(name = "descripcion", nullable = false, length = 400)
    private String descripcion;

    public AsistenteVirtual() {
    }

    public AsistenteVirtual(int idAsistenteVirtual, String nombre, String version, String descripcion) {
        this.idAsistenteVirtual = idAsistenteVirtual;
        this.nombre = nombre;
        this.version = version;
        this.descripcion = descripcion;
    }

    public int getIdAsistenteVirtual() {
        return idAsistenteVirtual;
    }

    public void setIdAsistenteVirtual(int idAsistenteVirtual) {
        this.idAsistenteVirtual = idAsistenteVirtual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
