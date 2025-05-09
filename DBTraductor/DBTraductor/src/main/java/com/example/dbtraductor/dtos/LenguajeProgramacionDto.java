package com.example.dbtraductor.dtos;


public class LenguajeProgramacionDto {
    private int idLenguajeProgramacion;
    private String nombre;
    private String tipo;

    public int getIdLenguajeProgramacion() {
        return idLenguajeProgramacion;
    }

    public void setIdLenguajeProgramacion(int idLenguajeProgramacion) {
        this.idLenguajeProgramacion = idLenguajeProgramacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
