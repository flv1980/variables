package com.miempresa.miapp.colecciones;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import lombok.NoArgsConstructor;
import java.io.Serializable;

public class Ordenador implements Serializable {
    private static final long serialVersionçUID = 1234567L;
    public String marca;
    public String modelo;
    public List<Pieza> pieza;

    public Ordenador() {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = new ArrayList<Pieza>();
    }

    public Ordenador(String marca, String modelo, List<Pieza> pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = pieza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Pieza> getPieza() {
        return pieza;
    }

    public void setPieza(List<Pieza> pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pieza=" + pieza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordenador ordenador = (Ordenador) o;
        return marca.equals(ordenador.marca) && modelo.equals(ordenador.modelo) && pieza.equals(ordenador.pieza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, pieza);
    }
}
