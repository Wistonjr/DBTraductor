package com.example.dbtraductor.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="feedback")
public class FeedBack {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFeedBack;
    @Column(name = "comentario", nullable = false, length = 300)
    private String comentario;
    @Column(name = "calificacion", nullable = false)
    private int calificacion;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;



    public FeedBack(int idFeedBack, String comentario, int calificacion, LocalDate fecha) {
        this.idFeedBack = idFeedBack;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    public FeedBack() {

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
}