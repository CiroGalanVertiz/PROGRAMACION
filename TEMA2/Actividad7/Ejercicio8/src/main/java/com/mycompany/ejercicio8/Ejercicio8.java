/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio8 {

    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un párrafo: ");
    String texto = teclado.nextLine().trim();

    if (texto.equals("")) {
        System.out.println("0 palabras.");
        return;
    }

    int palabras = 1;
    int maxLen = 0;
    int actual = 0;

    for (int i = 0; i < texto.length(); i++) {
        if (texto.charAt(i) != ' ') {
            actual++;
        } else {
            if (actual > maxLen) maxLen = actual;
            actual = 0;
            palabras++;
        }
    }
    if (actual > maxLen) maxLen = actual;

    System.out.println("Palabras: " + palabras);
    System.out.println("Palabra más larga: " + maxLen + " caracteres");
}

}
