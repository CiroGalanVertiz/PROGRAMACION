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
        Restaurante r1 = new Restaurante(4,2);
        r1.addHuevos(1);
        r1.addChorizo(1);
        System.out.println("chorizo: "+r1.getChorizo());
        System.out.println("huevos: "+r1.getHuevos());
        System.out.println(r1.getNumPlatos());
        r1.sirvePlato();
        System.out.println("chorizo: "+r1.getChorizo());
        System.out.println("huevos: "+r1.getHuevos());
}
}
