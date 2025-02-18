/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public abstract class Guerrero  implements Comparable<Guerrero>{
    
    private final String nombre;
    private int edad;
    private int fuerza;
    private boolean herido;
    private boolean muerto;

    public Guerrero(String nombre, int edad, int fuerza) {
        this.nombre = nombre;
        this.edad = comprobarEdad(edad)?edad:25;
        this.fuerza = comprobarEdad(edad)?fuerza:5;
        this.herido = false;
        this.muerto = false;
    }
    public Guerrero() {
        this.nombre = "GuerreroX";
        this.edad = 15;
        this.fuerza = 1;
        this.herido = false;
        this.muerto = false;
    }
    public Guerrero(String nombre, Guerrero g1) {
        this.nombre = nombre;
        this.edad = g1.edad;
        this.fuerza = g1.fuerza;
        this.herido = false;
        this.muerto = false;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isHerido() {
        return herido;
    }

    public boolean isMuerto() {
        return muerto;
    }
    
    public static boolean comprobarEdad(int e){
        return e<=60 && e>=15;
    }
    public static boolean comprobarFuerza(int f){
        return f<=10 && f>=1;
    }
    
    public abstract boolean retirarse();

    @Override
    public int compareTo(Guerrero o) {
        return this.fuerza - o.fuerza;
    }
    
    
}
