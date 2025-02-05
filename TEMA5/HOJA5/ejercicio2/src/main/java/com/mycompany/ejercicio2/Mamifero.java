/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM120
 */
public class Mamifero {
    private String raza;
    private int npatas;
    private String alimento;

    public Mamifero(String raza, int npatas, String alimento) {
        this.raza = raza;
        this.npatas = npatas;
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + "de npatas=" + npatas + "y alimento=" + alimento + '}';
    }
    
    
}
