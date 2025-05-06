package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.entities.Usuario;

import java.time.LocalDate;

public class FeedBackDto {
    private int idFeedBack;
    private String comentario;
    private int calificacion;
    private LocalDate fecha;
    private Usuario idUsuario;
    private Traduccion idTraduccion;

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
