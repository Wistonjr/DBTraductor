package com.example.dbtraductor.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "LenguajeProgramacion")
public class LenguajeProgramacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLenguajeProgramacion;
    @Column(name ="nombre" ,nullable = false,length = 20)
    private String nombre;
    @Column(name = "tipo",nullable = false,length = 20)
    private String tipo;

    public LenguajeProgramacion() {}

    public LenguajeProgramacion(int idLenguajeProgramacion, String nombre, String tipo) {
        this.idLenguajeProgramacion = idLenguajeProgramacion;
        this.nombre = nombre;
        this.tipo = tipo;
    }

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
