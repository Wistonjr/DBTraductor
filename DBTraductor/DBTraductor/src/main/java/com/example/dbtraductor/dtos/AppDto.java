package com.example.dbtraductor.dtos;
import com.example.dbtraductor.entities.Rol;

import java.time.LocalDate;
public class AppDto {
    private int idApp;
    private String nombre;
    private int telefono;
    private LocalDate fechaNacimiento;
    private String email;
    private String password;
    private Rol idRol;
   // private int rolid;


    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getTelefono() {return telefono;}

    public void setTelefono(int telefono) {this.telefono = telefono;}

    public LocalDate getFechaNacimiento() {return fechaNacimiento;}

    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

   /* public int getRolid() {return rolid;}

    public void setRolid(int rolid) {this.rolid = rolid;}*/

    public int getIdApp() {
        return idApp;
    }

    public void setIdApp(int idApp) {
        this.idApp = idApp;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }
}
