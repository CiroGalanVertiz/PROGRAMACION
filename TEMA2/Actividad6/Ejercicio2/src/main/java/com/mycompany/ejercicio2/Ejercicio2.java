/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce N1: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce N2: ");
        int n2 = teclado.nextInt();

        int suma = 0;

        System.out.println("Números impares entre " + n1 + " y " + n2 + ":");
        for (int i = n1; i <= n2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                suma += i;
            }
        }

        System.out.println("\nSuma total: " + suma);
    }
}

