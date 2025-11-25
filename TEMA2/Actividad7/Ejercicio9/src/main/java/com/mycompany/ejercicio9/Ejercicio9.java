/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author cococ
 */
public class Ejercicio9 {

   public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Nombre: ");
    String nombre = teclado.nextLine();

    System.out.print("Fecha (DD/MM/AAAA): ");
    String fecha = teclado.nextLine();

    String parte1 = nombre.substring(0, 2).toUpperCase();
    String dia = fecha.substring(0, 2);
    String año = fecha.substring(6);

    String password = parte1 + año + "#" + dia + "!";
    System.out.println("Contraseña generada: " + password);
}

}
