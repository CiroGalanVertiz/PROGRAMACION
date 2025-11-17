/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author cococ
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce A: ");
        int A = teclado.nextInt();

        System.out.print("Introduce B: ");
        int B = teclado.nextInt();

        int cociente = 0;
        int resto = A;

        while (resto >= B) {
            resto -= B;
            cociente++;
        }

        System.out.println("Cociente = " + cociente);
        System.out.println("Resto = " + resto);
    }
}

