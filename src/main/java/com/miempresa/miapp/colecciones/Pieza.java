package com.miempresa.miapp.colecciones;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return nombre.equals(pieza.nombre) && tipo.equals(pieza.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo);
    }

}
