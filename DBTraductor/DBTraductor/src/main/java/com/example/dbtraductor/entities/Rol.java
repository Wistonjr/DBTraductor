package com.example.dbtraductor.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Rol",uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "rol"})})
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;
    @Column(name="rolName", nullable=false,length=30)
    private String rolName;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private Usuario user;

    public Rol() {
    }

    public Rol(Long idRol, String rolName, Usuario user) {
        this.idRol = idRol;
        this.rolName = rolName;
        this.user = user;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
