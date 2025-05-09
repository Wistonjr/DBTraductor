package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.Escaneo;
import com.example.dbtraductor.entities.LenguajeProgramacion;
import com.example.dbtraductor.entities.Usuario;

import java.time.LocalDate;

public class TraduccionDto {
    private int idTraduccion;
    private String codigoOriginal;
    private String codigoTraducido;
    private LocalDate fechaTraduccion;
    private Usuario idUsuario;
    private Escaneo idEscaneo;
    private LenguajeProgramacion idLenguajeProgramacion;

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
