package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.AsistenteVirtual;
import com.example.dbtraductor.entities.Traduccion;
import com.example.dbtraductor.entities.Usuario;

import java.time.LocalDate;

public class EscaneoDto {
    private int idEscaneo;
    private byte[] imagen;
    private LocalDate fechaEscaneo;
    private Usuario idUsuario;
    private AsistenteVirtual idAsistenteVirtual;
    private Traduccion idTraduccion;

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
