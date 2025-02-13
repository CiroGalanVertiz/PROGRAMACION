/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author dam120
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Curso c1= new Curso("DAW1",3);
        System.out.println("Es daw? "+c1.esDaw());
        System.out.println(c1.iniciales());
        System.out.println(c1.verNombre(1));
        c1.desplaza();
        System.out.println(c1.iniciales());
    }
}
