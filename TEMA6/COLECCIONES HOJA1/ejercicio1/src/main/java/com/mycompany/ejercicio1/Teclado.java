/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

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

    public static int nextInt(int rangoMin, int rangoMax) {
        System.out.println("introduce un numero del "+rangoMin+" al "+rangoMax);
        int a = 0;
        try {
            System.out.println("introduce un numero:");
            a = new Scanner(System.in).nextInt();
            if (a > rangoMax || a < rangoMin) {
                throw new Exception();
            }
        } catch (InputMismatchException e) {
            System.out.println("Numero incorrecto");
            nextInt(rangoMin, rangoMax);
        } catch (Exception e) {
            System.out.println("Fuera de rango");
            nextInt(rangoMin, rangoMax);
        }
        return a;
    }

    public static double nextDouble(String msj) {
        System.out.println(msj);
        double a = 0;
        try {
            a = new Scanner(System.in).nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Numero incorrecto");
            nextInt(msj);
        }
        return a;
    }

    public static double nextDouble(String msj, double rangoMin, double rangoMax) {
        System.out.println(msj);
        double a = 0;
        try {
            a = new Scanner(System.in).nextInt();
            if (a > rangoMax || a < rangoMin) {
                throw new Exception("Fuera de Rango");
            }
        } catch (InputMismatchException e) {
            System.out.println("Numero incorrecto");
            nextInt(msj);
        } catch (Exception e) {
            e.getMessage();
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

    public static String nextDNI(String msj) {
        String DNI = "";
        try {
            DNI = next(msj).toUpperCase();
            if (Pattern.matches("[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]", DNI)) {
                int numero = Integer.parseInt(DNI.substring(0, 8));
                String letra = DNI.substring(DNI.length() - 1);
                if (!validarDNI(numero, letra)) {
                    throw new Exception("DNI no valido");
                }
            } else {
                throw new Exception("Fomato incorrecto");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            nextDNI(msj);

        }
        return DNI;

    }

    private static boolean validarDNI(int numero, String letra) {

        return letra.equals("TRWAGMYFPDXBNJZSQVHLCKE".substring(numero % 23, (numero % 23) + 1));

    }
    private static String generarPatron(int rangoMin,int rangoMax){
        String cadena="(";
        for (int i = rangoMin; i <= rangoMax; i++) {
            cadena += i==rangoMax? i+")":i+"|";
        }
        
        return cadena;
    }
    

}
