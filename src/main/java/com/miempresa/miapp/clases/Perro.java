package com.miempresa.miapp.clases;

import java.util.Objects;

public class Perro {
    public String raza;

    public Perro(){
        this.raza = "";
    }
    public Perro(String raza){
        this.raza = raza;
    }
    public String getRaza(){ return raza; }
    public void setRaza(String raza){
        this.raza = raza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(raza, perro.raza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raza);
    }

    @Override
    public String toString(){
        return "Perro{" +
                "raza='" + raza +"'" +
                "}";
    }
}
