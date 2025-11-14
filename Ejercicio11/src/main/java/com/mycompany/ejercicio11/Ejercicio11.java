/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero de minutos");
        int min = teclado.nextInt();
         if(min>1){
             System.out.printf("El saldo de la llamada será: %,.02f€",(0.25+((min-1)*0.1)));   
    }
         else{
              System.out.print("El saldo de la llamada será: 0,25€");   
         }
    }
}
    
