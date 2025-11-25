/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio3 {

   public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce una palabra: ");
    String palabra = teclado.nextLine().toLowerCase().replace(" ", "");

    String invertida = "";
    for (int i = palabra.length() - 1; i >= 0; i--) {
        invertida += palabra.charAt(i);
    }

    if (palabra.equals(invertida)) 
        System.out.println("Es un palíndromo.");
    else 
        System.out.println("No es un palíndromo.");
}

}
