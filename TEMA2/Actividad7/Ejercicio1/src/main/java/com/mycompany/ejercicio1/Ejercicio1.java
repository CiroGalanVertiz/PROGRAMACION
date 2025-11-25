/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio1 {
    public static void main(String args[]) {
    String palabra = "programa";
    String oculto = "_".repeat(palabra.length());
    int intentos = 6;

    Scanner teclado = new Scanner(System.in);

    while (intentos > 0 && oculto.contains("_")) {
        System.out.println("Palabra: " + oculto + " ("+oculto.length()+" letras) "+"Intentos: " + intentos);
        System.out.print("Ingresa una letra: ");
        String letra = teclado.nextLine();

        if (letra.length() == 1 && palabra.contains(letra)) {
            String nuevo = "";
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra.charAt(0)) {
                    nuevo += letra;
                } else {
                    nuevo += oculto.charAt(i);
                }
            }
            oculto = nuevo;
        } else {
            intentos--;
        }
    }

    if (oculto.contains("_")) System.out.println("Perdiste. La palabra era: " + palabra);
    else System.out.println("¡Ganaste! " + palabra);
}

}
