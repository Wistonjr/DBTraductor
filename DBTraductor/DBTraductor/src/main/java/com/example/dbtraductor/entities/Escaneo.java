package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Escaneo")
public class Escaneo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEscaneo;
    @Lob
    @Column(name="imagen", nullable=true,length=200)
    private String imagen;
    @Column(name="fechaEscaneo", nullable=false)
    private LocalDate fechaEscaneo;

    @ManyToOne
    @JoinColumn(name ="idUsuario")
    private Users idUsuario;
    @ManyToOne
    @JoinColumn(name ="idAsistenteVirtual")
    private AsistenteVirtual idAsistenteVirtual;

    public Escaneo() {
    }

    public Escaneo(int idEscaneo, String imagen, LocalDate fechaEscaneo, Users idUsuario, AsistenteVirtual idAsistenteVirtual, Traduccion idTraduccion) {
        this.idEscaneo = idEscaneo;
        this.imagen = imagen;
        this.fechaEscaneo = fechaEscaneo;
        this.idUsuario = idUsuario;
        this.idAsistenteVirtual = idAsistenteVirtual;
    }

    public int getIdEscaneo() {
        return idEscaneo;
    }

    public void setIdEscaneo(int idEscaneo) {
        this.idEscaneo = idEscaneo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaEscaneo() {
        return fechaEscaneo;
    }

    public void setFechaEscaneo(LocalDate fechaEscaneo) {
        this.fechaEscaneo = fechaEscaneo;
    }

    public Users getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Users idUsuario) {
        this.idUsuario = idUsuario;
    }

    public AsistenteVirtual getIdAsistenteVirtual() {
        return idAsistenteVirtual;
    }

    public void setIdAsistenteVirtual(AsistenteVirtual idAsistenteVirtual) {
        this.idAsistenteVirtual = idAsistenteVirtual;
    }
}
