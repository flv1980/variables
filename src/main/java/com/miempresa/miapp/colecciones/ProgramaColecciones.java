package com.miempresa.miapp.colecciones;
import com.miempresa.miapp.clases.Colores;
import  java.util.*;

public class ProgramaColecciones {
    public static void main(String[] args) {
        Pieza pieza = new Pieza();
        Ordenador ordenador = new Ordenador();
        pieza.setNombre("Disco");
        pieza.setTipo("duro");
        //ordenador.pieza = pieza; --> definido como atributo object dentro de ordenador
        //Definido como atributo List dentro de ordenador
        ordenador.pieza.add(pieza);
        System.out.println("Pieza: " + Colores.blue + pieza.toString() + Colores.reset);

        List<Pieza> piezas = new ArrayList<>();
        //ordenador = new Ordenador("Disco","duro",piezas);

        Pieza pieza1 = new Pieza("Pantalla","Plana");
        Pieza pieza2 = new Pieza("Raton","Inalambrico");
        Pieza pieza3 = new Pieza("Memoria","RAM");
        Pieza pieza4 = new Pieza("Teclado","Mecánico");

        ordenador.setMarca("DELL");
        ordenador.setModelo("Latitude");
        ordenador.getPieza().add(pieza1);
        ordenador.getPieza().add(pieza2);
        ordenador.getPieza().add(pieza3);
        ordenador.getPieza().add(pieza4);

        System.out.println("Marca: " + Colores.yellow + ordenador.marca + Colores.reset);
        System.out.println("Modelo: " + Colores.yellow + ordenador.modelo + Colores.reset);
        System.out.println("Pieza1: " + Colores.yellow + ordenador.pieza.get(0) + Colores.reset);
        System.out.println("Pieza2: " + Colores.yellow + ordenador.pieza.get(1) + Colores.reset);
        System.out.println("Pieza3: " + Colores.yellow + ordenador.pieza.get(2) + Colores.reset);
        System.out.println("Pieza4: " + Colores.yellow + ordenador.pieza.get(3) + Colores.reset);


        Set<Pieza> misPiezas = new HashSet<>();
        try{
            for(Pieza p :ordenador.pieza){
                misPiezas.add(p);
            }
            //misPiezas.add(ordenador.pieza.get(0));
            //misPiezas.add(pieza2);
            //misPiezas.add(ordenador.pieza.get(2));
            //misPiezas.add(ordenador.pieza.get(3));
            System.out.println(Colores.red + "SET: " + Colores.reset + misPiezas);
        }
        catch (Exception e){
            System.out.println("ERROR" + e.toString());
        }
        Pieza piezaRepetida = new Pieza("Memoria","RAM");
        misPiezas.add(piezaRepetida);
        System.out.println(Colores.red + "SET ¿Repetida?: " + Colores.reset + misPiezas);
        //TreeSet<Pieza> piezasOrdenadas = new TreeSet<Pieza>(misPiezas);
        //System.out.println(Colores.red + "SET Ordenada: " + Colores.reset + piezasOrdenadas);
    }
}
