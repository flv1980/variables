package com.miempresa.miapp.ejercicios;

public class Arrays {
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
        Crea un array de números enteros de 4 posiciones con el nombre miarray
        */
        int[] miArray = new int[4];
        /*
        Ejercicio 5:
        Inicializa manualmente cada una de las posiciones del array
        */
        miArray[0]=1;
        miArray[1]=2;
        miArray[2]=3;
        miArray[3]=4;
        /*
        Ejercicio 6:
        Recorre el array con un bucle for con un bucle e imprime el valor asignado a cada una de las posiciones
        */
        for (int i:miArray){
            System.out.println("miArrayFor: " + blue+ i+reset);
        }
        /*
        Ejercicio 7:
        Recorre el array con un bucle while con un bucle e imprime el valor asignado a cada una de las posiciones
        */
        int j = 0;
        while (j < miArray.length) {
            System.out.println("miArrayWhile: " + purple+ j+reset);
            j++;
        }
        /*
        Ejercicio 8:
        Recorre el array con un bucle do-while con un bucle e imprime el valor asignado a cada una de las posiciones
        */
        j = 0;
        do{
            System.out.println("miArrayDoWhile: " +yellow+ j+reset);
            j++;
        } while (j < miArray.length);
        /*
        Ejercicio 9:
        Declara un array de 2000 posiciones de números de tipo float llamado flotantes, inicializa con un bucle todos los valores a 0 del array, cambia la segunda posición del array y ponle el valor 7.3f y saca su valor por pantalla
        */
        float[] bigArray = new float[2000];
        for(j=0;j<bigArray.length;j++){
            bigArray[j]=0;
            if(j==1) {
                bigArray[j]=7.3f;
                System.out.println("Valor de la segunda posicion: "+red+bigArray[j]+reset);
            }
        }
        /*
        Ejercicio 10:
        Saca por pantalla el número de elementos de array
        */
        System.out.println("Numero de elementos de bigArray: "+red+bigArray.length+reset+"😀");
    }
}
