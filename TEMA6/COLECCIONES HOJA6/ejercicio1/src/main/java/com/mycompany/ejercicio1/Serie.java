/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author DAM120
 */
public class Serie {
    private String nombre;
    private Tematica tematica;
    private String Nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private HashMap<String,Capitulo> capitulos;

    public Serie(String nombre, String Nacionalidad, int tematica,int temporadas, boolean finalizada) {
        this.nombre = nombre;
        this.Nacionalidad = Nacionalidad;
        this.tematica = switch(tematica){
            case 1->Tematica.Policial;
            case 2->Tematica.Comedia;
            case 3->Tematica.Infantil;
            case 4->Tematica.Aventura;
            default->Tematica.Aventura;
                
        };
        this.temporadas=temporadas;
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

    public HashMap<String, Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(HashMap<String, Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + "\ntematica=" + tematica + "\nNacionalidad=" + Nacionalidad + "\nfinalizada=" + finalizada;
    }
    public static String generaClaveCapitulo(String nombre,int temporada,int capitulo){
        return nombre.substring(0,4)+String.format("%02d", temporada)+"X"+String.format("%02d", capitulo);
    }
    public String generaClaveCapitulo(Capitulo capitulo){
        return nombre.substring(0,4)+String.format("%02d", capitulo.getNumTmp())+"X"+String.format("%02d",capitulo.getNumCap());
    }
    public void insertarCapitulo(String clave,Capitulo capitulo){
        if(!capitulos.containsValue (capitulo)){
        capitulos.put(clave, capitulo);
    }
        else{
            System.out.println("el capitulo no se insertó");
        }
    }
    public void eliminaCapitulo(String clave){
        Iterator<String> it  = capitulos.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            if(clave.equalsIgnoreCase(key)){
                System.out.println("se ha borrado correctamente");
                it.remove();
            }else{
                System.out.println("ek capitulo no existe");
            }
            
        }
    }
    public void visualizaCapitulo(){
        for (HashMap.Entry<String, Capitulo> jugador : capitulos.entrySet()) {
            String clave = jugador.getKey();
            Capitulo capitulo = jugador.getValue();
            System.out.println(clave + "  ->  " + capitulo.getDescripcion());
        }
    }
    
    
    
    
    
}
