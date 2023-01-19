package com.miempresa.miapp.ejercicios;
import com.miempresa.miapp.clases.Colores;
import com.miempresa.miapp.clases.Perro;

public class Clases {
    public static void main(String[] args) {
        Perro toby = new Perro();
        toby.raza = "Terrier";
        Perro otto = new Perro();
        otto.raza = "Pastor Alemán";
        System.out.println(new StringBuilder().append("El perro Toby es de la raza: ").append(Colores.red).append(toby.raza).append(Colores.reset).toString());
        System.out.println("El perro Otto es de la raza: " + Colores.green + otto.raza + Colores.reset);
        Perro fluky = new Perro("Pastor de aguas");
        System.out.println("El perro Fluky es de la raza: " + Colores.blue + fluky.raza + Colores.reset);
        fluky.setRaza("Partor de FER");
        System.out.println("El perro Fluky es de la raza (GET): " + Colores.yellow + fluky.getRaza() + Colores.reset);
    }
}
