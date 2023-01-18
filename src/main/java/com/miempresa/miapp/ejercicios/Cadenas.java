package com.miempresa.miapp.ejercicios;

public class Cadenas {
    public static void main(String[] args) {
        String black="\033[30m";
        String red="\033[31m";
        String green="\033[32m";
        String yellow="\033[33m";
        String blue="\033[34m";
        String purple="\033[35m";
        String cyan="\033[36m";
        String white="\033[37m";
        String reset="\u001B[0m";

        //Ejercicio 4: Declara una cadena llamada saludo con el valor "Hola"
        String saludo = "Hola";

        //Ejercicio 5: Saca por pantalla el número de caracteres de la cadena
        System.out.println("Numero de caracteres de la cadena: " + red + saludo.length() + reset + "  ✋");

        //Ejercicio 6: Saca por pantalla el 4º caracter de la cadena
        System.out.println("El cuarto caracter del string es: " + green + saludo.charAt(3) + reset);

        //Ejercicio 7: Saca por pantalla la cadena en mayúsculas
        System.out.println("La cadena pasada a mayusculas: " + yellow + saludo.toUpperCase() + reset);

        //Ejercicio 8: Saca por pantalla la cadena en minúsculas
        System.out.println("La cadena pasada a minusculas: " + blue + saludo.toLowerCase() + reset);

        //Ejercicio 9: Saca por pantalla la posición del carácter 'l'
        int posi = saludo.indexOf("l") + 1;
        System.out.println("La posicion de la l en la cadena es: " + purple + posi + reset);

        //Ejercicio 10: Declara otra cadena llamada saludo2 y compárala con la cadena saludo, saca un mensaje por pantalla indicando si son o no iguales
        String saludo2 = "Adios";
        if(saludo==saludo2){
            System.out.println("Son iguales. " + cyan + saludo2 +reset);
        }
        else{
            System.out.println("No son iguales. " + cyan + saludo2 +reset);
        }
        if(saludo.equals(saludo2)){
            System.out.println("Son iguales. " + cyan + saludo2 +reset);
        }
        else{
            System.out.println("Equals. No son iguales. " + cyan + saludo2 +reset + "  👋");
        }
    }
}
