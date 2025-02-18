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
         Troyano t1= new Troyano("Ciro",23,2);
        Griego g1= new Griego("Saul",25,2);
        System.out.println(g1.getNombre());
        System.out.println(t1.getNombre());
    }
}
