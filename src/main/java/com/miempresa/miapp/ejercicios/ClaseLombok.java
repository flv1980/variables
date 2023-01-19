package com.miempresa.miapp.ejercicios;
import com.miempresa.miapp.clases.*;

import java.util.Date;

public class ClaseLombok {
    public static void main(String[] args) {
        Lombok persona1 = new Lombok("Fernando","López Vecino",42,new Date(1980,1,17),"chico");
//        persona1.setNombre("Fernando");
//        persona1.setApellido("López Vecino");
//        persona1.setEdad(42);
//        persona1.setFechaNacimiento(new Date(1980,1,17));
        System.out.println(Colores.yellow+"Persona1: "+Colores.reset+persona1);
        System.out.println("Nombre: "+Colores.cyan+persona1.getNombre()+Colores.reset);
        System.out.println("Apellido: "+Colores.cyan+persona1.getApellido()+Colores.reset);
        System.out.println("Edad: "+Colores.cyan+persona1.getEdad()+Colores.reset);
        System.out.println("Fecha de Nacimiento: "+Colores.cyan+persona1.getFechaNacimiento()+Colores.reset);
        if(persona1.getGenero()=="chico"){
            System.out.println("Genero: "+Colores.cyan+"\uD83D\uDC66"+Colores.reset);}
        else if (persona1.getGenero()=="chica") {
            System.out.println("Genero: "+Colores.cyan+"\uD83D\uDC67"+Colores.reset);}
        else{
            System.out.println("Genero: "+Colores.cyan+"\uD83E\uDD37"+Colores.reset);
        }

        Lombok persona2 = new Lombok("Cristina","Catalán Buelta",42,new Date(1980,8,27),"chica");
        System.out.println(Colores.yellow+"Persona2: "+Colores.reset+persona1);
        System.out.println("Nombre: "+Colores.red+persona2.getNombre()+Colores.reset);
        System.out.println("Apellido: "+Colores.red+persona2.getApellido()+Colores.reset);
        System.out.println("Edad: "+Colores.red+persona2.getEdad()+Colores.reset);
        System.out.println("Fecha de Nacimiento: "+Colores.red+persona2.getFechaNacimiento()+Colores.reset);
        if(persona2.getGenero()=="chico"){
            System.out.println("Genero: "+Colores.cyan+"\uD83D\uDC66"+Colores.reset);}
        else if (persona2.getGenero()=="chica") {
            System.out.println("Genero: "+Colores.cyan+"\uD83D\uDC67"+Colores.reset);}
        else{
            System.out.println("Genero: "+Colores.cyan+"\uD83E\uDD37"+Colores.reset);
        }
    }
}
