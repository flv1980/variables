package com.miempresa.miapp.clases;

public class Empleado extends Persona{
    protected float sueldo;
    public String cargo;

    public Empleado() {
        super();
        this.sueldo = 0;
        this.cargo = "";
    }

    public Empleado(String nombre, String dni, Integer tlf, float sueldo, String cargo) {
        super(nombre, dni, tlf);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }


    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
