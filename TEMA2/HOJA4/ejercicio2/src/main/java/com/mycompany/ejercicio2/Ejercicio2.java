/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Coche c1 = new Coche("1234RET",100);
        Coche c2 = new Coche();
        c1.acelera(110);
        c1.frena(30);
        System.out.println(c1.letrasMatricula());
        System.out.println(c1.printCoche());
        
    }
}
