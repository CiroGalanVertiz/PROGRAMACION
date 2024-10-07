/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author cococ
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Taller t1 = new Taller(8,20);
        t1.addAceite(3);
        t1.addRuedas(6);
        t1.cambioParcial();
        t1.cambioCompleto();
        System.out.println(t1.toString());
        Taller t2 = new Taller(t1);
        System.out.println(t2.toString());
    }
}
