package com.miempresa.miapp.ejercicios;
public class Estructuras {
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
        /*
        Ejercicio 4:
        Crea un bucle de tipo While que de 10 vueltas e imprima el número de vuelta por pantalla.
        */
        int i = 0;
        while (i < 11) {
            System.out.println("While: " + i);
            i++;
        }
        /*
        Ejercicio 5:
        Crea un bucle de tipo do-while que de 10 vueltas e imprima el número de vuelta por pantalla.
        */
        i = 0;
        do {
            System.out.println("Do While:" + i);
            i++;
        } while (i < 11);
        /*
        Ejercicio 6:
        Crea un bucle de tipo for que de 10 vueltas e imprima el número de vuelta por pantalla.
        */
        for (i=0;i<11;i++){
            System.out.println("For: " + i);
        }
        /*
        Ejercicio 7:
        Crea una sentencia condicional para que dependiendo de si el valor de la edad (int) de una persona, imprima por pantalla si puede o no conducir un coche
        */
        int edad=19;
        if (edad>17)
            System.out.println("Edad: " + edad + " y puede conducir.");
        else
            System.out.println("Edad: " + edad + " y NO puede conducir.");
        /*
        Ejercicio 8:
        Crea una sentencia condicional múltiple, para que dependiendo de la edad de una persona, si tiene 18, puede conducir, su tiene 21 podria beber en USA y si es cualquier otro valor, simplemente imprima la edad por pantalla.
        */
        edad =42;
        switch (edad){
            case 18  -> {System.out.println("Puede conducir!!");}
            case 21 -> {System.out.println("Puede beber!!");}
            default-> {System.out.println("EDAD: "+ edad);}
        }
        /*
        Ejercicio 9:
        Crea un bucle de tipo While que de 10 vueltas e imprima el número de vuelta por pantalla. Dentro del bucle, su el valor que utilizas de contador de vueltas es 5, haz que se salga con un break, si es 2 que haga un continue.
        */
        i = 0;
        uno: while (i < 11) {
            switch (i){
                case 2:
                    System.out.println(yellow + "Es 2, continuo");
                case 5:
                    System.out.println(red + "Es 5, me piro");
                    break uno;
                default:
                    System.out.println(purple + "Número: " + i);
            }
            i++;
        }
    }
}

