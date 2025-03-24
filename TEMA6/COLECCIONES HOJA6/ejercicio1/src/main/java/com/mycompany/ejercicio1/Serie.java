/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.HashMap;

/**
 *
 * @author DAM120
 */
public class Serie {
    private String nombre;
    private Tematica tematica;
    private String Nacionalidad;
    private boolean finalizada;
    private HashMap<String,String> capitulos;

    public Serie(String nombre, Tematica tematica, String Nacionalidad, boolean finalizada) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.Nacionalidad = Nacionalidad;
        this.finalizada = finalizada;
        this.capitulos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public HashMap<String, String> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(HashMap<String, String> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\ntematica=" + tematica + "\nNacionalidad=" + Nacionalidad + "\nfinalizada=" + finalizada;
    }
    public static String generaClaveCapitulo(String nombre,int temporada,int capitulo){
        return nombre.substring(0,4)+String.format("%02d", temporada)+String.format("%02d", capitulo);
    }
    public String generaClaveCapitulo(Capitulo capitulo){
        return nombre.substring(0,4)+String.format("%02d", capitulo.getNumTmp())+String.format("%02d",capitulo.getNumCap());
    }
    public void insertarCapitulo(){
        
    }
    public void eliminaCapitulo(){
        
    }
    public void visualizaCapitulo(){
        
    }
    
    
    
    
    
}
