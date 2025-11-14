/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num = teclado.nextInt();
        for (int i = num-1; i <= 1; i--) {
            num*=i;
        }
        System.out.println(num);
    }
}
