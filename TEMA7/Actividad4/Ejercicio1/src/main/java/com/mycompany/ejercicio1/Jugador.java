/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Objects;

/**
 *
 * @author DAM121
 */
public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private int estatura;

    public Jugador(String nombre, int estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    @Override
    public int compareTo(Jugador o) {
        if(this.getNombre().compareTo(o.getNombre())==0){
            return this.estatura-o.estatura;
        }
        else{
            return this.getNombre().compareTo(o.getNombre());
        }
        
        
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", estatura=" + estatura + '}';
    }

   
    
    
}
