/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Mundo m1= new Mundo();
        m1.añadirPais("españa");
        m1.añadirPais("españa");
        m1.añadirPais("nicaragua");
        m1.borrarPais("españa");
        m1.añadirPais("españa");
        System.out.println(m1);
        
    }
}
