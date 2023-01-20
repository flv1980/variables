package com.miempresa.miapp.clases;

public class Currito extends Empleado {
    public String Horario;
    public String Puesto;

    public Currito() {
        Horario = "";
        Puesto = "";
    }
    public Currito(String horario, String puesto) {
        Horario = horario;
        Puesto = puesto;
    }

    public Currito(String nombre, String dni, Integer tlf, float sueldo, String cargo, String horario, String puesto) {
        super(nombre, dni, tlf, sueldo, cargo);
        Horario = horario;
        Puesto = puesto;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "Horario='" + Horario + '\'' +
                ", Puesto='" + Puesto + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
}
