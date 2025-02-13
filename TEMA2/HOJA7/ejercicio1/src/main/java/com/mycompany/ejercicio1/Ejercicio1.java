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
        Rectangulo r1 = new Rectangulo();
        r1.setAncho(3);
        r1.setLargo(4);
        r1.area();
        r1.diagonal();
        System.out.println("El ancho es: "+r1.getAncho());
        System.out.println("El largo es: "+r1.getLargo());
    }
}
