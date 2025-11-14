/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerccicio5;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejerccicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la base");
        int b = teclado.nextInt();
        System.out.println("Introduce el exponente");
        int e = teclado.nextInt();
        for (int i = 0; i < e; i++) {
            b*=b;
        }
        System.out.println(b);
    }
}
