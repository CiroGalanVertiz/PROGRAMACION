/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num1 = teclado.nextInt();
        System.out.println("Escribe un numero");
        int num2 = teclado.nextInt();
        if(num1%num2==0){
            System.out.println(num2 +" es divisor de "+ num1);
        }
        else if(num2%num1==0){
            System.out.println(num1 +" es divisor de "+ num2);
        }
        else{
            System.out.println("Ninguno es divisor del otro");
        }
    }
}
