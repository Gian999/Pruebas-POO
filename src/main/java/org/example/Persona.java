package org.example;
import java.util.Date;

public class Persona {
    protected String nombre;
    protected String estadoAsis;
    protected String genero;
    Date fecha = new Date();
    public Persona(String nombre, String estadoAsis, String genero) {
        this.nombre = nombre;
        this.estadoAsis = estadoAsis;
        this.fecha = fecha;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoAsis() {
        return estadoAsis;
    }

    public void setEstadoAsis(String estadoAsis) {
        this.estadoAsis = estadoAsis;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
