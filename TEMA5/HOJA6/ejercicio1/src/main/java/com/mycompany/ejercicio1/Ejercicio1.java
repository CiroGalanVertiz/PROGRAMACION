/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Ejercicio1{

    public static void main(String[] args){
        DeDos d1= new DeDos();
        for (int i = 0; i < 5; i++) {
            System.out.println(d1.getSiguiente());
            d1.setComenzar(d1.getSiguiente());
        }
        d1.reiniciar();
        d1.setComenzar(100);
        for (int i = 0; i < 5; i++) {
            System.out.println(d1.getSiguiente());
            d1.setComenzar(d1.getSiguiente());
        }
        
    }
}
