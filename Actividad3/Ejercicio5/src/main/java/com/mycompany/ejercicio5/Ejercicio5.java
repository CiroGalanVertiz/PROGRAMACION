/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author DAM121
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        

        System.out.print("Ingrese un año: ");
        int anio = new Scanner(System.in).nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
}

