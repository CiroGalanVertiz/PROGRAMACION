/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Griego extends Guerrero {

    public Griego(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }

    public Griego() {
        super();
    }
    

    @Override
    public boolean retirarse() {
        return this.isHerido() && !this.isMuerto();
    }
    
    
}
