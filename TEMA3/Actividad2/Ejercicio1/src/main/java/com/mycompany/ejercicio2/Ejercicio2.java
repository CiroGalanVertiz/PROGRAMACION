/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;


import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo c1  = new Circulo();
        Circulo c2  = new Circulo(10);
        System.out.println("Introduce el radio de c3");
        Circulo c3  = new Circulo(teclado.nextDouble());
        c1.setRadio(5);
        System.out.println("El radio de c1 es "+ c1.getRadio());
        System.out.println("El radio de c3 es "+ c3.getRadio());
        System.out.println("El area de c2 es "+ c2.area());
        System.out.println("El area de c3 es "+ c3.area());
        System.out.println("La longitud de c3 es "+ c3.longitud());
        
        
    }
}
