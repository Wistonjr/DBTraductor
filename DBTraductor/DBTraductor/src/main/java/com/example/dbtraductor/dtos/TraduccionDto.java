package com.example.dbtraductor.dtos;

import com.example.dbtraductor.entities.Glosario;
import com.example.dbtraductor.entities.Usuario;

import java.time.LocalDate;

public class TraduccionDto {
    private int idTraduccion;
    private String lenguajeProgramacion;
    private String codigoOriginal;
    private String codigoTraducido;
    private LocalDate fechaTraduccion;
    private Usuario idUsuario;
    private Glosario idGlosario;

    public int getIdTraduccion() {
        return idTraduccion;
    }

    public void setIdTraduccion(int idTraduccion) {
        this.idTraduccion = idTraduccion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
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

    public Glosario getIdGlosario() {
        return idGlosario;
    }

    public void setIdGlosario(Glosario idGlosario) {
        this.idGlosario = idGlosario;
    }
}
