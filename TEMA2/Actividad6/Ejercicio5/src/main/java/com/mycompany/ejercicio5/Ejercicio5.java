/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author cococ
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int contador = 0;

        while (suma <= 600) {
            System.out.print("Introduce donativo: ");
            int d = teclado.nextInt();
            suma += d;
            contador++;
        }

        System.out.println("Se necesitaron " + contador + " donativos para superar 600€.");
    }
}

