/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Numero n1 = new Numero();
       Numero n2 = new Numero(new Scanner(System.in).nextInt());
        System.out.println(n1.suma(4));
        System.out.println(n2.resta(3));
        System.out.println(n1.getNumero());
        System.out.println(n2.getNumero());
        System.out.println(n2.doble());
        System.out.println(n2.triple());
    }
}
