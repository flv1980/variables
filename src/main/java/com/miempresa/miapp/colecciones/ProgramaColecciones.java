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

        piezas.add(pieza1);
        piezas.add(pieza2);
        ordenador.setMarca("DELL");
        ordenador.setModelo("Latitude");
        ordenador.setPieza(piezas);
        piezas = new ArrayList<>();
        piezas.add(pieza3);
        piezas.add(pieza4);
        Ordenador ordenador1 = new Ordenador("IBM","3500",piezas);

        System.out.println("Ordenador: " + Colores.yellow + ordenador + Colores.reset);
        System.out.println("Ordenador1: " + Colores.yellow + ordenador1 + Colores.reset);


        Set<Object> misPiezas = new HashSet<>();
        try{
            //for(Pieza p :ordenador.pieza){
            //    misPiezas.add(p);
            //}
            misPiezas.add(pieza1);
            misPiezas.add(pieza2);
            misPiezas.add(pieza3);
            misPiezas.add(pieza4);
            System.out.println(Colores.red + "SET: " + Colores.reset + misPiezas);
        }
        catch (Exception e){
            System.out.println("ERROR" + e.toString());
        }
        //Pieza piezaRepetida = new Pieza("Memoria","RAM");
        misPiezas.add(pieza1);
        System.out.println(Colores.red + "SET ¿Repetida?: " + Colores.reset + misPiezas);

        //TreeSet<Pieza> piezasOrdenadas = new TreeSet<Pieza>();
        //System.out.println(Colores.red + "SET Ordenada: " + Colores.reset + piezasOrdenadas);

        Map clienteMapa = new HashMap<Integer,Cliente>();
        Cliente cliente = new Cliente("pepe","mi calle",666000000,"p@p.com");
        clienteMapa.put(0,cliente);
        System.out.println(Colores.green + "Mapa cliente: " + Colores.reset + clienteMapa.get(0));

        List<Map> listMap = new ArrayList<>();
        listMap.add(clienteMapa);
        System.out.println(Colores.purple + "Listado Mapa: " + Colores.reset + listMap);
    }
}
