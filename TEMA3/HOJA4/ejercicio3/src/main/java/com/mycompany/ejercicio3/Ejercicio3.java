/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        for (int i = 2016; i <= 2030; i++) {
            System.out.print("ano " + i+": ");
            int a = i % 19;
            int b = i % 4;
            int c = i % 7;
            int d = (19 * a + 24) % 30;
            int e = (2 * b + 4 * c + 6 * d + 5) % 7;
            int n = (22 + d + e);
            if (n > 31) {
                System.out.println(n - 31 + " de Abril");
            } else {
                System.out.println(n + " de Marzo");
            }
        }

    }
}
