/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM121
 */
public class Capitulo {
    int numTemp;
    int numCap;
    String descripcion;
    public Capitulo(){
        
        this.numTemp=Teclado.nextInt("Introduce el numero de la temporada");
        this.numCap=Teclado.nextInt("Introduce el numero del capitulo");  
        this.descripcion=Teclado.nextLine("Introduce una descripcion");
        
    }

    public int getNumTemp() {
        return numTemp;
    }

    public int getNumCap() {
        return numCap;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Capitulo{" + "numTemp=" + numTemp + ", numCap=" + numCap + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
