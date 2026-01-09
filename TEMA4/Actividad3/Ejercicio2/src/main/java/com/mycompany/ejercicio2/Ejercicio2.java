/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("Escribe el dividendo");
            int num1 = teclado.nextInt();
            System.out.println("Escribe el divisor");
            int num2 = teclado.nextInt();
            System.out.println(num1/num2);
        }
        catch(InputMismatchException e){
            System.out.println("introduce un numero");
            main(args);
        }
        catch(ArithmeticException e){
            System.out.println("el divisor tiene que ser distinto de 0");
            main(args);
        }
        
    }
}
