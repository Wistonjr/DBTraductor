package com.example.dbtraductor.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;

    @Column(name="rolName", nullable=false,length=30)
    private String rolName;

    public Rol(int idRol, String rolName) {
        this.idRol = idRol;
        this.rolName = rolName;
    }

    public Rol() {
    }

    public int getIdRol() {return idRol;}

    public void setIdRol(int idRol) {this.idRol = idRol;}

    public String getRolName() {return rolName;}

    public void setRolName(String rolName) {this.rolName = rolName;}
}
