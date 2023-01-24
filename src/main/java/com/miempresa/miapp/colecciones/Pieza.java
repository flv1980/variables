package com.miempresa.miapp.colecciones;

import java.io.Serializable;

public class Pieza implements Serializable {
    private static final long serialVersionçUID = 12345678L;
    public String nombre;
    public String tipo;

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

    public Pieza() {
        nombre = "";
        tipo = "";
    }

    public Pieza(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
