/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author cococ
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce edad " + i + ": ");
            int edad = teclado.nextInt();

            if (edad > mayor) mayor = edad;
            if (edad < menor) menor = edad;
        }

        System.out.println("Edad mayor: " + mayor);
        System.out.println("Edad menor: " + menor);
    }
}

