/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author cococ
 */
public class GestorSeries {

    private ArrayList<Serie> series = new ArrayList<>();

    public Serie existeSerie(String nombre) {
        boolean encontrado = false;
        Serie serie = null;
        Iterator<Serie> it = series.iterator();
        while (it.hasNext() && !encontrado) {
            serie = it.next();
            if (serie.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            serie = null;

        }
        return serie;
    }

    public void crearSerie() {
        String nombre = Entrada.nextLine("Introduce el nombre de la serie");
        String nacionalidad = Entrada.nextLine("Introduce la nacionalidad de la serie");
        int opcion = 0;
        while (opcion > 0 && opcion <= 4) {
            opcion = Entrada.nextInt("Introduce la Tematica\nLas opciones son:\n\t1. Policial\n\t2. Comedia\n\t3. Infantil\n\t4. Aventuras");
            if (opcion < 0 && opcion > 4) {
                System.out.println("Numero incorrecto");
            }
        }
        int numTemp = Entrada.nextInt("introduce el numero de temporadas(1-15)", 1, 15);
        boolean finalizado = Entrada.nextBoolean("Ha finalizado la serie? (Si/No)");
        Serie s = new Serie(nombre, nacionalidad, opcion, numTemp, finalizado);
        if (existeSerie(s.getNombre()) == null) {
            series.add(s);
        }
    }

    public void eliminaSerie() {
        Serie s = existeSerie(Entrada.nextLine("Introduce el nombre de la serie que quieras borrar"));
        Iterator<Serie> it = series.iterator();
        boolean borrado = false;
        if (s != null) {

            while (it.hasNext() && !borrado) {
                Serie serie = it.next();
                if (serie.equals(s)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("serie no encontrada");
        }
    }

    public void verSeries() {
        Iterator<Serie> it = series.iterator();
        String cadena = null;
        int opcion = 0;
        do {
            opcion = Entrada.nextInt("Flitrar por:\n1. Por nacionalidad\n2. Por tematica\n3. Ver todas", 1, 3);
            switch (opcion) {
                case 1 -> {
                    while (it.hasNext()) {
                        String nacionalidad = Entrada.nextLine("Introduce la nacionalidad");
                        Serie s = it.next();
                        if (s.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                            cadena += it;
                        }
                    }

                }
                case 2 -> {
                    Tematica tematica;
                    do {
                        opcion = Entrada.nextInt("Introduce la Tematica\nLas opciones son:\n\t1. Policial\n\t2. Comedia\n\t3. Infantil\n\t4. Aventuras", 1, 4);
                        tematica = switch (opcion) {
                            case 1 ->
                                Tematica.Policial;
                            case 2 ->
                                Tematica.Comedia;
                            case 3 ->
                                Tematica.Infantil;
                            case 4 ->
                                Tematica.Aventura;
                            default ->
                                Tematica.Aventura;
                        };
                    } while (opcion < 0 && opcion > 4);
                    while (it.hasNext()) {
                        Serie s = it.next();
                        if (s.getTematica().name().equalsIgnoreCase(tematica.name())) {
                            cadena += it;
                        }
                    }
                }
                case 3 -> {
                    while (it.hasNext()) {
                        cadena += it.next();
                    }
                }
            }
        } while (opcion < 0 && opcion > 3);
    }

    public void crearCapitulo() {
        

    }
    public void eliminarCapitulo(){
        Serie s = existeSerie(Entrada.nextLine("Introduce el nombre de la serie que quieras borrar"));
        int numTemp = Entrada.nextInt("numero de temporada:");
        int numCap = Entrada.nextInt("numero de capitulo:");
        Iterator<Serie> it = series.iterator();
        boolean encontrado = false;
        if (s != null) {
            while (it.hasNext() && !encontrado) {

                Serie serie = it.next();
                if (serie.equals(s)) {
                    for (HashMap.Entry<String, Capitulo> capitulo : s.getCapitulos().entrySet()) {
                        if(capitulo.getValue().getNumCap()==numCap && capitulo.getValue().getNumTmp()==numTemp){
                            s.getCapitulos().remove(capitulo.getKey());
                        }
                    
                    }
                }
            }
        }
    }

}
