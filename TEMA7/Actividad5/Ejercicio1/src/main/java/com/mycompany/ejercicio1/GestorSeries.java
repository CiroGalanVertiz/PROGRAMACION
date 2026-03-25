/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DAM121
 */
public class GestorSeries {
    
    List<Serie> series;
    public GestorSeries(){
        this.series= new ArrayList<>();
    }
    
    public Serie existeSerie(String nombre){
        Iterator<Serie> it = this.series.iterator();
        boolean encontrado=false;
        Serie s= null;
        while(it.hasNext() && !encontrado){
            Serie serie = it.next();
            if(serie.getNombre().equals(nombre)){
                encontrado=true;
                s=serie;
            }
            
        }
        return s;
    }
    
    public void anadirSerie(){
        if(series.add(new Serie())){
            System.out.println("serie aniadida");
    }
        else{
            System.out.println("la serie no se pudo aniadir");
        }
    }
    public void eliminarSerie(){
        String cadena = "no se encontro la serie";
        String nombre=Teclado.nextLine("Introduce el nombre de la serie que desea eliminar:");
        if (existeSerie(nombre)!=null){
            Serie s=existeSerie(nombre);
            cadena="serie eliminada";
            Iterator<Serie> it = this.series.iterator();
        boolean eliminado=false;
        while(it.hasNext()&& !eliminado){
            Serie serie = it.next();
            if(serie.getNombre().equalsIgnoreCase(s.getNombre())){
                it.remove();
            eliminado=true;
        }
        }
        }
        System.out.println(cadena);
        }
    public void verSeries(){
        for(Serie s: this.series){
            System.out.println(s);
        }
    }
    public void anadirCapitulo(){
        String cadena = "no se encontro la serie";
        String serie=Teclado.nextLine("Introduce el nombre de la serie a la que desea anadir un capitulo:");
        if (existeSerie(serie)!=null){
            Serie s=existeSerie(serie);
            s.insertarCapitulo(new Capitulo());
            cadena="Capitulo anadido";
        }
        System.out.println(cadena);
        
    }
    public void eliminarCapitulo(){
        String cadena = "no se encontro la serie";
        String serie=Teclado.nextLine("Introduce el nombre de la serie que desea eliminar:");
        if (existeSerie(serie)!=null){
            Serie s=existeSerie(serie);
            s.eliminarCapitulo(Serie.generaClaveCapitulo(s.getNombre(),Teclado.nextInt("Introduce el numero de temporada del capitulo que desea eliminar:"),Teclado.nextInt("Introduce el numero del capitulo que desea eliminar:")));
            cadena="Capitulo eliminado";
        }
        System.out.println(cadena);
        
    }
    public void verCpaitulos(){
        String cadena = "no se encontro la serie";
        String serie=Teclado.nextLine("Introduce el nombre de la serie:");
        if (existeSerie(serie)!=null){
            Serie s=existeSerie(serie);
            s.visualizaCapitulos();
        }
    }
    }

