/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio8 {
    

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Escribe un numero");
        int num1 = teclado.nextInt();
        System.out.println("Escribe un numero");
        int num2 = teclado.nextInt();
        System.out.println("Escribe un numero");
        int num3 = teclado.nextInt();
        if(num1<num3 && num1<num2){
            if(num3<num2){
                System.out.println("El orden es: "+ num2+", "+num3+", "+num1);
            }
            else{
                System.out.println("El orden es: "+ num3+", "+num2+", "+num1);
            }
        }
       
        
    }
}
