/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio2 {

    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = teclado.nextLine();

    System.out.print("¿Cuántas vocales crees que tiene?: ");
    int guess = Integer.parseInt(teclado.nextLine());

    int contador = 0;
    String vocales = "aeiouAEIOU";

    for (int i = 0; i < frase.length(); i++) {
        if (vocales.contains("" + frase.charAt(i))) contador++;
    }

    System.out.println("Vocales reales: " + contador);
    if (guess == contador) System.out.println("¡Correcto!");
    else System.out.println("Fallaste.");
}

}
