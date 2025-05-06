package com.example.dbtraductor.dtos;

public class AsistenteVirtualDto {
    private int idAsistenteVirtual;
    private String nombre;
    private String version;
    private String descripcion;

    public int getIdAsistenteVirtual() {
        return idAsistenteVirtual;
    }

    public void setIdAsistenteVirtual(int idAsistenteVirtual) {
        this.idAsistenteVirtual = idAsistenteVirtual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
