/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Serie {

    private String nombre;
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private Map<String, Capitulo> capitulos;

    public Serie() {
            this.nombre = Teclado.nextLine("Introduce el nombre de la serie:");
            this.tematica= Tematica.valueOf(Teclado.nextLine("Introduce la tematica(policial/comedia/infantil/aventura):").toLowerCase());
            this.nacionalidad = Teclado.nextLine("Introduce la nacionalidad:");
            int numTemp = Teclado.nextInt("Introduce el numero de temporadas:");
            if(numTemp<0 || numTemp>15){
                throw new InputMismatchException();
            }
            else{
                this.temporadas=numTemp;
            }
            this.finalizada=false;
            this.capitulos=new HashMap<>();
        

    }

    public Serie(String nombre, Tematica tematica, String Nacionalidad, int temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = Nacionalidad;
        this.temporadas = temporadas;
        this.finalizada=false;
    }

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", tematica=" + tematica + ", Nacionalidad=" + nacionalidad + ", finalizada=" + finalizada + ", temporadas=" + temporadas + '}';
    }
    public static String generaClaveCapitulo(String nombre,int numTemp,int numCap){
        return nombre.substring(0,4).concat(String.format("%d02",numTemp)).concat(String.format("%d02",numCap));
    }
    
    public void insertarCapitulo(Capitulo capitulo){
        this.capitulos.put(generaClaveCapitulo(this.nombre,capitulo.numTemp,capitulo.numCap),capitulo);
    }
    public void eliminarCapitulo(String clave){
        this.capitulos.remove(clave);
    }
    public void visualizaCapitulos(){
        for(Entry<String,Capitulo> entry : this.capitulos.entrySet()){
            System.out.println(entry.getValue().toString());
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    
    

}
