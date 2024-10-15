/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author dam1
 */
public class Triangulo {
    
    private int lado1,lado2,lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public boolean esIsosceles(){
        return lado1==lado2 && lado2!=lado3 || lado1==lado3 && lado3!=lado2 || lado2 == lado3 && lado3 !=lado1;
    }
    public boolean esEquilatero(){
        return lado1==lado2 && lado2==lado3;
    }
    public double perimetro(){
        return lado1+lado2+lado3;
    }
}
