package com.miempresa.miapp.colecciones2;

import com.miempresa.miapp.clases.Colores;

import java.util.*;

public class ejerciciosColecciones {
    public static void main(String[] args) {
        List<String> listado = new LinkedList<>();
        listado.add("uno");
        listado.add("dos");
        System.out.println(Colores.red + "Listado elem.1: " + Colores.reset + listado.get(0));
        for (String l:listado) {
            System.out.println(Colores.yellow + "For Each del listado: " + Colores.reset + l);
        }
        listado.remove(0);
        for (String l:listado) {
            System.out.println(Colores.purple + "For Each del listado (borrado el primero): " + Colores.reset + l);
        }
        int count[] = {17,27};
        Set<Integer> numeros = new HashSet<Integer>();
        try {
            for (int i = 0; i < 2; i++) {
                numeros.add(count[i]);
                System.out.println(Colores.green + "Recorro el elemento Set: " + Colores.reset + numeros);
            }
        }catch(Exception e){}

        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"Mapa1");
        mapa.put(2,"Mapa2");
        System.out.println(Colores.cyan + "Listo el prier elemento del MAP: " + Colores.reset + mapa.get(1));
        for (int i = 1; i < 3; i++) {
            System.out.println(Colores.blue + "Recorro el Mapa: " + Colores.reset +mapa.get(i));
        }
        Serie serie1 = new Serie();
        Actor actor1 = new Actor("Actor1",5,"Terror");
        Actor actor2 = new Actor("Actriz1",6,"Drama");
        serie1.setGenero("Comedia");
        serie1.setAnyo(2022);
        serie1.setTitulo("Dos pistolas para un manco.");
        List<Actor> reparto = new ArrayList<>();
        reparto.add(actor1);
        reparto.add(actor2);
        serie1.setReparto(reparto);

        System.out.println(Colores.red + "SERIE: " + Colores.reset + serie1);

    }
}
