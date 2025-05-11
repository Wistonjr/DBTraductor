package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Traduccion")
public class Traduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTraduccion;
    @Lob
    @Column(name="codigoOriginal", nullable=false)
    private String codigoOriginal;
    @Lob
    @Column(name="codigoTraducido", nullable=false)
    private String codigoTraducido;
    @Column(name="fechaTraduccion", nullable=false)
    private LocalDate fechaTraduccion;
    @ManyToOne
    @JoinColumn(name ="idUsuario")
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name ="idEscaneo")
    private Escaneo idEscaneo;
    @ManyToOne
    @JoinColumn(name ="idLenguajeProgramacion")
    private LenguajeProgramacion idLenguajeProgramacion;

    public Traduccion() {}

    public Traduccion(int idTraduccion, String codigoOriginal, String codigoTraducido, LocalDate fechaTraduccion, Usuario idUsuario, Escaneo idEscaneo, LenguajeProgramacion idLenguajeProgramacion) {
        this.idTraduccion = idTraduccion;
        this.codigoOriginal = codigoOriginal;
        this.codigoTraducido = codigoTraducido;
        this.fechaTraduccion = fechaTraduccion;
        this.idUsuario = idUsuario;
        this.idEscaneo = idEscaneo;
        this.idLenguajeProgramacion = idLenguajeProgramacion;
    }

    public int getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(int idTraduccion) {
        this.idTraduccion = idTraduccion;
    }

    public String getCodigoOriginal() {
        return codigoOriginal;
    }

    public void setCodigoOriginal(String codigoOriginal) {
        this.codigoOriginal = codigoOriginal;
    }

    public String getCodigoTraducido() {
        return codigoTraducido;
    }

    public void setCodigoTraducido(String codigoTraducido) {
        this.codigoTraducido = codigoTraducido;
    }

    public LocalDate getFechaTraduccion() {
        return fechaTraduccion;
    }

    public void setFechaTraduccion(LocalDate fechaTraduccion) {
        this.fechaTraduccion = fechaTraduccion;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Escaneo getIdEscaneo() {
        return idEscaneo;
    }

    public void setIdEscaneo(Escaneo idEscaneo) {
        this.idEscaneo = idEscaneo;
    }

    public LenguajeProgramacion getIdLenguajeProgramacion() {
        return idLenguajeProgramacion;
    }

    public void setIdLenguajeProgramacion(LenguajeProgramacion idLenguajeProgramacion) {
        this.idLenguajeProgramacion = idLenguajeProgramacion;
    }
}
