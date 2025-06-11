package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.AsistenteVirtual;
import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.entities.Users;

import java.time.LocalDate;

public class EscaneoDto {
    private int idEscaneo;
    private String imagen;
    private LocalDate fechaEscaneo;
    private Users idUsuario;
    private AsistenteVirtual idAsistenteVirtual;
    private Traduccion idTraduccion;

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

    public Traduccion getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(Traduccion idTraduccion) {
        this.idTraduccion = idTraduccion;
    }
}
