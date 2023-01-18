package com.miempresa.miapp.ejercicios;
import com.miempresa.miapp.clases.Colores;
/*
Ejercicio 1:
Crea un nuevo proyecto llamado variables
Ejercicio 2:
Crea un paquete llamado com.miempresa.miapp
Ejercicio 3:
Crea una Clase con el método main llamada App
Ejercicio 4:
Declara las siguientes variables, asígnales un valor y sácalas por pantalla: entero llamado numero, corto llamado marianico, largo llamado gasol, booleano llamado independencia, double llamado presupuesto y float llamado longitud.
Ejercicio 5:
Declara una variable llamada suma: que sea la suma de gasol y marianico, y sácala por pantalla
 */
public class APP {
    public static void main(String[] args)
    {
        Colores color= new Colores();
        System.out.println(color.green);
        System.out.println(color.hola);
        System.out.println(color.red);

        int numero=17;
        short marianico=10;
        long gasol=1980;
        boolean independencia=false;
        double presupuesto=22.50;
        float longitud=16.34f;

        var suma=gasol+marianico;

        System.out.println("int: "+numero);
        System.out.println("short: "+marianico);
        System.out.println("long: "+gasol);
        System.out.println("boolean: "+independencia);
        System.out.println("double: "+presupuesto);
        System.out.println("float: "+longitud);
        System.out.println("Suma: "+suma);
    }
}