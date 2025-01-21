/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author DAM120
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Sopa s1= new Sopa();
        Sopa s2= new Sopa(5,5);
        s1.mostrar();
        s2.mostrar();
        s2.setPalabra("habitacion",0,1,1);
        s2.mostrar();
    }
}
