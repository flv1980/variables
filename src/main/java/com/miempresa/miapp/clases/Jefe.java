package com.miempresa.miapp.clases;

public class Jefe extends Empleado{
    public String Puesto;
    public Integer personasCargo;

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public Integer getPersonasCargo() {
        return personasCargo;
    }

    public void setPersonasCargo(Integer personasCargo) {
        this.personasCargo = personasCargo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "Puesto='" + Puesto + '\'' +
                ", personasCargo='" + personasCargo + '\'' +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                '}';
    }
    public Jefe() {
        Puesto = "";
        this.personasCargo = 0;
    }
    public Jefe(String puesto, Integer personasCargo) {
        Puesto = puesto;
        this.personasCargo = personasCargo;
    }

    public Jefe(String nombre, String dni, Integer tlf, float sueldo, String cargo, String puesto, Integer personasCargo) {
        super(nombre, dni, tlf, sueldo, cargo);
        Puesto = puesto;
        this.personasCargo = personasCargo;
    }
}
