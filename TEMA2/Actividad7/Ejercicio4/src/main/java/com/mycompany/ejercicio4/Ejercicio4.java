/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio4 {

   public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Palabra 1: ");
    String p1 = teclado.nextLine().toLowerCase();

    System.out.print("Palabra 2: ");
    String p2 = teclado.nextLine().toLowerCase();

    String aux1 = p1;
    String aux2 = p2;

    // Eliminamos letras una por una
    for (int i = 0; i < p1.length(); i++) {
        String letra = "" + p1.charAt(i);
        if (aux2.contains(letra)) {
            int pos = aux2.indexOf(letra);
            aux2 = aux2.substring(0, pos) + aux2.substring(pos + 1);
        }
    }

    if (aux2.length() == 0 && p1.length() == p2.length())
        System.out.println("Son anagramas.");
    else {
        System.out.println("No son anagramas.");
        System.out.println("Letras que faltan: " + aux2);
    }
}


}
