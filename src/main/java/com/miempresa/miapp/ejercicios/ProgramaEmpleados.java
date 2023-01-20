package com.miempresa.miapp.ejercicios;
import com.miempresa.miapp.clases.*;
public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado("Fernando","53038200Q",617845566,5000,"Jefe");
        empleado1.setNombre("Cristina");
        empleado1.setDni("48999890T");
        empleado1.setTlf(676350208);
        empleado1.setSueldo(5000);
        empleado1.setCargo("Currito");
        System.out.println("Empleado1: " + Colores.yellow + empleado1.toString() + Colores.reset);
        System.out.println("Nombre: " + Colores.blue + empleado2.getNombre() +Colores.reset);
        System.out.println("DNI: " + Colores.blue + empleado2.dni +Colores.reset);
        System.out.println("Tfno: " + Colores.blue + empleado2.tlf +Colores.reset);
        System.out.println("Sueldo: " + Colores.blue + empleado2.getSueldo() +Colores.reset);
        System.out.println("Cargo: " + Colores.blue + empleado2.cargo +Colores.reset);

        Currito currito1 = new Currito("Pringuelas","1234567Z",666000111,1000,"Currito","Mañana","Mozo almacen");
        System.out.println("Currito: " + Colores.green + currito1.toString() + Colores.reset);
        Jefe jefe = new Jefe("Florentino","280000000",600600600,10000,"Jefe","CEO",55);
        System.out.println("Jefe: " + Colores.red + jefe.toString() + Colores.reset);
        //Tengo acceso al sueldo aunque sea protected porque lo pueden utilizar ya que es heredada
        System.out.println("Sueldo del jefe: " + Colores.purple + jefe.getSueldo());
    }
}
