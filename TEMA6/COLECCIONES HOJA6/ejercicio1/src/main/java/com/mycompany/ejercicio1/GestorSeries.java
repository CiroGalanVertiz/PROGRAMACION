/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cococ
 */
public class GestorSeries {
    private ArrayList<Serie> series = new ArrayList<>();
    
    public Serie existeSerie(String nombre){
        boolean encontrado=false;
        Serie serie = null;
        Iterator<Serie> it= series.iterator();
        while(it.hasNext() && !encontrado){
            serie = it.next();
            if(serie.getNombre().equalsIgnoreCase(nombre)){
                encontrado=true;
            }
        }
        if(!encontrado){
            serie =null;
           
        }
        return serie;
    }
    public void crearSerie(){
        String nombre =Entrada.nextLine("Introduce el nombre de la serie");
        String nacionalidad =Entrada.nextLine("Introduce la nacionalidad de la serie");
        int opcion=0;
        while(opcion>0 &&opcion<=4){
            opcion=Entrada.nextInt("Introduce la Tematica\nLas opciones son:\n\t1. Policial\n\t2. Comedia\n\t3. Infantil\n\t4. Aventuras");
            if(opcion<0 &&opcion>4){
                System.out.println("Numero incorrecto");
            }
        }
       int numTemp = Entrada.nextInt("introduce el numero de temporadas(1-15)",1,15);
       boolean finalizado = Entrada.nextBoolean("Ha finalizado la serie? (Si/No)");
       Serie s = new Serie(nombre,nacionalidad,opcion,numTemp,finalizado);
       if(existeSerie(s.getNombre())==null){
        series.add(s);
       }
        
    }
}
