package com.miempresa.miapp.colecciones;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
public class Ordenador implements Serializable {
    private static final long serialVersionçUID = 1234567L;
    public String marca;
    public String modelo;
    public List <Pieza> pieza;

    public Ordenador() {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = new ArrayList<Pieza>();
    }
    public Ordenador(String marca, String modelo, List pieza) {
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = pieza;
    }
}
