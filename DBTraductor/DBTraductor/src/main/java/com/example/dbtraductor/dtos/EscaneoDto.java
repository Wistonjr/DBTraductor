package com.example.dbtraductor.dtos;
import java.time.LocalDate;

public class EscaneoDto {
    private int idEscaneo;
    private byte imagen;
    private LocalDate fecha_escaneo;

    public int getIdEscaneo() {
        return idEscaneo;
    }

    public void setIdEscaneo(int idEscaneo) {
        this.idEscaneo = idEscaneo;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFecha_escaneo() {
        return fecha_escaneo;
    }

    public void setFecha_escaneo(LocalDate fecha_escaneo) {
        this.fecha_escaneo = fecha_escaneo;
    }
}
