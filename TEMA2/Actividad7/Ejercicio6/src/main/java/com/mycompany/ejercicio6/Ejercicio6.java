/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author cococ
 */
public class Ejercicio6 {

   public static void main(String args[]) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Texto: ");
    String texto = sc.nextLine();

    System.out.print("Desplazamiento: ");
    int d = Integer.parseInt(sc.nextLine());

    String resultado = "";

    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);
        if (c >= 'a' && c <= 'z') {
            c = (char) ('a' + (c - 'a' + d) % 26);
        }
        if (c >= 'A' && c <= 'Z') {
            c = (char) ('A' + (c - 'A' + d) % 26);
        }
        resultado += c;
    }

    System.out.println("Cifrado: " + resultado);
}


}
