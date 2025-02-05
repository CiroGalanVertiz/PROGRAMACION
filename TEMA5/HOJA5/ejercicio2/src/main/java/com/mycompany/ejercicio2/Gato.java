/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM120
 */
public class Gato extends Mamifero implements Domestico,Felino {
    private String nombre;

    public Gato(String raza, int npatas, String alimento) {
        super(raza, npatas, alimento);
    }

    @Override
    public String obedecer() {
        return "Obedezco";
    }

    @Override
    public String arañar() {
        return "Aranio";
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + super.toString();
    }
    
    
}
