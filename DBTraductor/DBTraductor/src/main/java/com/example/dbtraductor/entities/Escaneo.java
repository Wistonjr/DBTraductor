package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Escaneo")
public class Escaneo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEscaneo;

    @Column(nullable = false)
    private byte imagen;

    @Column(nullable = false)
    private LocalDate fecha_escaneo;


    public Escaneo(int idEscaneo, byte imagen, LocalDate fecha_escaneo) {
        this.idEscaneo = idEscaneo;
        this.imagen = imagen;
        this.fecha_escaneo = fecha_escaneo;
    }

    public Escaneo() {
    }

    public int getIdEscaneo() {
        return idEscaneo;
    }

    public void setIdEscaneo(int idEscaneo) {
        this.idEscaneo = idEscaneo;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFecha_escaneo() {
        return fecha_escaneo;
    }

    public void setFecha_escaneo(LocalDate fecha_escaneo) {
        this.fecha_escaneo = fecha_escaneo;
    }
}
