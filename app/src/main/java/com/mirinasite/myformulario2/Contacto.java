package com.mirinasite.myformulario2;

public class Contacto {

    private String nombre;
    private String fecha;
    private String telefono;
    private String email;
    private String descripción;

    public Contacto(String nombre, String fecha, String telefono, String email, String descripción) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.telefono = telefono;
        this.email = email;
        this.descripción = descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescripcion(String descripción) {
        this.descripción = descripción;
    }
}

