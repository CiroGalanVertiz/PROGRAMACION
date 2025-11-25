/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio7 {

    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = teclado.nextLine();

    String modificada = "";
    String vocales = "aeiouAEIOU";

    for (int i = 0; i < frase.length(); i++) {
        char c = frase.charAt(i);
        if (vocales.contains("" + c)) modificada += "*";
        else modificada += c;
    }

    System.out.println("Frase modificada: " + modificada);

    System.out.print("Adivina la frase original: ");
    String intento = sc.nextLine();

    if (intento.equals(frase)) System.out.println("¡Correcto!");
    else System.out.println("Incorrecto.");
}

}
