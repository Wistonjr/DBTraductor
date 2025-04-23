package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="escaneo")
public class Escaneo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEscaneo;
    @Lob
    @Column(name="imagen", nullable=true)
    private byte[] imagen;
    @Column(name="fechaEscaneo", nullable=false)
    private LocalDate fechaEscaneo;

    @ManyToOne
    @JoinColumn(name ="idUsuario")
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name ="idAsistenteVirtual")
    private AsistenteVirtual idAsistenteVirtual;
    @ManyToOne
    @JoinColumn(name ="idTraduccion")
    private Traduccion idTraduccion;

    public Escaneo() {
    }

    public Escaneo(int idEscaneo, byte[] imagen, LocalDate fechaEscaneo, Usuario idUsuario, AsistenteVirtual idAsistenteVirtual, Traduccion idTraduccion) {
        this.idEscaneo = idEscaneo;
        this.imagen = imagen;
        this.fechaEscaneo = fechaEscaneo;
        this.idUsuario = idUsuario;
        this.idAsistenteVirtual = idAsistenteVirtual;
        this.idTraduccion = idTraduccion;
    }

    public int getIdEscaneo() {
        return idEscaneo;
    }

    public void setIdEscaneo(int idEscaneo) {
        this.idEscaneo = idEscaneo;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaEscaneo() {
        return fechaEscaneo;
    }

    public void setFechaEscaneo(LocalDate fechaEscaneo) {
        this.fechaEscaneo = fechaEscaneo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public AsistenteVirtual getIdAsistenteVirtual() {
        return idAsistenteVirtual;
    }

    public void setIdAsistenteVirtual(AsistenteVirtual idAsistenteVirtual) {
        this.idAsistenteVirtual = idAsistenteVirtual;
    }

    public Traduccion getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(Traduccion idTraduccion) {
        this.idTraduccion = idTraduccion;
    }
}
