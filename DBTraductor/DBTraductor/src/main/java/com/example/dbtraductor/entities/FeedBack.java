package com.example.dbtraductor.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Feedback")
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFeedBack;
    @Column(name = "comentario", nullable = false, length = 400)
    private String comentario;
    @Column(name = "calificacion", nullable = false)
    private int calificacion;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name ="idUsuario")
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name ="idTraduccion")
    private Traduccion idTraduccion;

    public FeedBack() {
    }

    public FeedBack(int idFeedBack, String comentario, int calificacion, LocalDate fecha, Usuario idUsuario, Traduccion idTraduccion) {
        this.idFeedBack = idFeedBack;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.idUsuario = idUsuario;
        this.idTraduccion = idTraduccion;
    }

    public int getIdFeedBack() {
        return idFeedBack;
    }

    public void setIdFeedBack(int idFeedBack) {
        this.idFeedBack = idFeedBack;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Traduccion getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(Traduccion idTraduccion) {
        this.idTraduccion = idTraduccion;
    }
}