package com.example.dbtraductor.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="traduccion")
public class Traduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTraduccion;
    @Column(name="lenguajeProgramacion", nullable=false,length=20)
    private String lenguajeProgramacion;
    @Lob
    @Column(name="codigoOriginal", nullable=false)
    private String codigoOriginal;
    @Lob
    @Column(name="codigoTraducido", nullable=false)
    private String codigoTraducido;
    @Column(name="fechaTraduccion", nullable=false)
    private LocalDate fechaTraduccion;
    @ManyToOne
    @JoinColumn(name ="usuarioId")
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name ="glosarioId")
    private Glosario idGlosario;

    public Traduccion(int idTraduccion, String lenguajeProgramacion, String codigoOriginal, String codigoTraducido, LocalDate fechaTraduccion, Usuario idUsuario, Glosario idGlosario) {
        this.idTraduccion = idTraduccion;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.codigoOriginal = codigoOriginal;
        this.codigoTraducido = codigoTraducido;
        this.fechaTraduccion = fechaTraduccion;
        this.idUsuario = idUsuario;
        this.idGlosario = idGlosario;
    }

    public Traduccion() {

    }

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
