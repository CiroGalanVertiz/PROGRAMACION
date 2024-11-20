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
        int[] ciudades= new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce la temperatura de la ciudad "+(i+1));
            ciudades[i]= new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("La temperatura de la ciudad "+(i+1)+ " es: "+ciudades[i]);
        }
    }
}
