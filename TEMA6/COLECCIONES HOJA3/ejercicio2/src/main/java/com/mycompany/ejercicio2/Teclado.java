/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author DAM120
 */
public class Teclado {
     public static int nextInt(String msj) {
        System.out.println(msj);
        int a = 0;
        try {
            a = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Numero incorrecto");
            nextInt(msj);
        }
        return a;
    }
    public static String next(String msj) {
        System.out.println(msj);
        String cadena = new Scanner(System.in).next();
        return cadena;
    }

    public static String nextLine(String msj) {
        System.out.println(msj);
        String cadena = new Scanner(System.in).nextLine();
        return cadena;
    }
}
