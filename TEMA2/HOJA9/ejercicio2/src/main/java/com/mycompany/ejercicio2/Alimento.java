/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author dam1
 */
public class Alimento {
    
    private String nombre; 
    private int grasas; 
    private int hidratos; 
    private boolean origenAnimal; 
  
    public Alimento(String nombre, int grasas, int hidratos, boolean origenAnimal) { 
        this.nombre = nombre; 
        this.grasas = grasas; 
        this.hidratos = hidratos; 
        this.origenAnimal = origenAnimal; 
    } 
  
    public String getNombre() { 
        return nombre; 
    } 
  
    public int getGrasas() { 
        return grasas; 
    } 
  
    public int getHidratos() { 
        return hidratos; 
    } 
  
    public boolean isOrigenAnimal() { 
        return origenAnimal; 
    } 
  
    @Override 
    public String toString() { 
        return "Alimento{" + "nombre=" + nombre + ", grasas=" + grasas + ", hidratos=" + hidratos + ", origenAnimal=" + origenAnimal + '}'; 
    } 
    public boolean esDietetico(){ 
        boolean comprobar=grasas<12&&origenAnimal==false?true:false; 
        return comprobar; 
    } 
    public double calorias(int gramos){ 
        double calorias=gramos*(grasas*5.3+hidratos*2.1); 
        return calorias; 
    } 
    
}
