/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de kilos");
        int kg = teclado.nextInt();
        if(kg>=10){
            System.out.printf("El total es de %,.02f€",kg*1.2);
        }
        else{
            System.out.printf("El total es de %€,.02f",kg*1.5);
        }
    }
}
