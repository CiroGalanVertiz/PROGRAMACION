/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Triangulo t1= new Triangulo(21,21,34);
       Triangulo t2= new Triangulo(21,21,21);
       System.out.println("¿El triangulo t1 es isosceles? "+t1.esIsosceles());
       System.out.println("¿El triangulo t1 es equilatero? "+t1.esEquilatero());
       System.out.println("¿El triangulo t2 es equilatero? "+t2.esEquilatero());
       System.out.println("Perimetrodel t2: "+t2.perimetro());
       
    }
}
