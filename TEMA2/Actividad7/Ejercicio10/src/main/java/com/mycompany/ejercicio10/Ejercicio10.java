/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

/**
 *
 * @author cococ
 */
public class Ejercicio10 {

   public static void main(String args[]) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.print("Introduce una frase: ");
    String frase = sc.nextLine();

    String resultado = frase;
    resultado = resultado.replace("amor", "❤️");
    resultado = resultado.replace("feliz", "😄");
    resultado = resultado.replace("triste", "😢");
    resultado = resultado.replace("fuego", "🔥");

    System.out.println("Resultado: " + resultado);
}

}
