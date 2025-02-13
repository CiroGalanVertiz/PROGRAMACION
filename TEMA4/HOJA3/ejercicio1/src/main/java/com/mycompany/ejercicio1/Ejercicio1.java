/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Triatlon t1= new Triatlon("03","Jose",5);
        System.out.println("Es seleccionado? "+t1.esSeleccionado());
        System.out.println(t1.mostrar());
        Triatlon t2= new Triatlon();
        System.out.println("Es seleccionado? "+t2.esSeleccionado());
        System.out.println(t2.mostrar());
    }
}
