/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author cococ
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final int COMBINACION = 1234;
        int intentos = 4;

        while (intentos > 0) {
            System.out.print("Introduce la combinación: ");
            int n = teclado.nextInt();

            if (n == COMBINACION) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                return;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Lo siento, esa no es la combinación. Le quedan " + intentos + " intentos.");
                }
            }
        }

        System.out.println("Ha agotado todos los intentos.");
    }
}

