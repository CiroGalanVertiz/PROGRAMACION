/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Troyano extends Guerrero {

    public Troyano(String nombre, int edad, int fuerza) {
        super(nombre, edad, fuerza);
    }
    
    

    @Override
    public boolean retirarse() {
        return false;
    }
    
}
