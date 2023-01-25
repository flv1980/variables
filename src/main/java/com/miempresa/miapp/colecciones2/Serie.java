package com.miempresa.miapp.colecciones2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Serie implements Serializable {
    private static final long serialVersionçUID = 1234567L;
    public String titulo;
    public String genero;
    public Integer anyo;
    public List<Actor> reparto;

    public Serie() {
        titulo = "";
        genero = "";
        anyo = 0;
        reparto = new ArrayList<>();
    }

    public Serie(String titulo, String genero, Integer anyo, List<Actor> reparto) {
        this.titulo = titulo;
        this.genero = genero;
        this.anyo = anyo;
        this.reparto = reparto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public void setAnyo(Integer anyo) {
        this.anyo = anyo;
    }

    public List<Actor> getReparto() {
        return reparto;
    }

    public void setReparto(List<Actor> reparto) {
        this.reparto = reparto;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anyo=" + anyo +
                ", reparto=" + reparto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return titulo.equals(serie.titulo) && genero.equals(serie.genero) && anyo.equals(serie.anyo) && reparto.equals(serie.reparto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, anyo, reparto);
    }
}
