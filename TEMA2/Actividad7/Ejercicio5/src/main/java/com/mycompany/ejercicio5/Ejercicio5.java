/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio5 {

    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = teclado.nextLine();

    frase = frase + " ";

    String palabra = "";
    String resultado = "";

    for (int i = 0; i < frase.length(); i++) {
        if (frase.charAt(i) != ' ') {
            palabra += frase.charAt(i);
        } else {
            String invertida = "";
            for (int j = palabra.length() - 1; j >= 0; j--) {
                invertida += palabra.charAt(j);
            }
            resultado += invertida + " ";
            palabra = "";
        }
    }

    System.out.println(resultado);
}

}
