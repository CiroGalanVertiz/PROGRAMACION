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
        System.out.println("Escribe un numero");
        int num = new Scanner(System.in).nextInt();
        if (num%10==0) {
            System.out.println("Es divisible entre 2 y 5");
        }
        else{
            System.out.println("no es divisible entre 2 y 5");
        }
    }
}
