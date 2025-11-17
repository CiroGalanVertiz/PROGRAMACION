/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author cococ
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        for (int anio = 2016; anio <= 2030; anio++) {
            int A = anio % 19;
            int B = anio % 4;
            int C = anio % 7;
            int D = (19 * A + 24) % 30;
            int E = (2 * B + 4 * C + 6 * D + 5) % 7;
            int N = 22 + D + E;

            if (N <= 31) {
                System.out.println("Año " + anio + ": " + N + " de marzo");
            } else {
                System.out.println("Año " + anio + ": " + (N - 31) + " de abril");
            }
        }
    }
}

