/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
         System.out.println("Escribe un numero");
        int num = new Scanner(System.in).nextInt();
        if(num==0){
            System.out.println("Es nulo");
        }
        else if(num<0){
            System.out.println("Es negativo");
        }
        else{
            System.out.println("Es negativo");
        }
        }
    }
}
