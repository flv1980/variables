package com.miempresa.miapp.colecciones2;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable {
    private static final long serialVersionçUID = 12345678L;
    public String nombre;
    public Integer anyosExp;
    public  String generoFav;

    public Actor() {
        nombre = "";
        anyosExp = 0;
        generoFav = "";
    }

    public Actor(String nombre, Integer anyosExp, String generoFav) {
        this.nombre = nombre;
        this.anyosExp = anyosExp;
        this.generoFav = generoFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnyosExp() {
        return anyosExp;
    }

    public void setAnyosExp(Integer anyosExp) {
        this.anyosExp = anyosExp;
    }

    public String getGeneroFav() {
        return generoFav;
    }

    public void setGeneroFav(String generoFav) {
        this.generoFav = generoFav;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", anyosExp=" + anyosExp +
                ", generoFav='" + generoFav + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return nombre.equals(actor.nombre) && anyosExp.equals(actor.anyosExp) && generoFav.equals(actor.generoFav);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anyosExp, generoFav);
    }
}
