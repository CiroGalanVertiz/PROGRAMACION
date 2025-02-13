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
        Baraja B1 = new Baraja();
        Baraja B2 = new Baraja();
        System.out.println("La primera carta es: " + B1.mostrar());
        System.out.println("La segunda carta es: " + B2.mostrar());
        if (B1.getNum() > B2.getNum()) {
            System.out.println("La carta " + B1.mostrar() + " tiene el numero mas alto");
        } else {
            System.out.println("La carta " + B2.mostrar() + " tiene el numero mas alto");

        }

    }
}
