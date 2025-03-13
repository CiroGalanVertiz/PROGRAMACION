/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
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
    public static String next(String msj,String regex) {
        System.out.println(msj);
        String cadena = new Scanner(System.in).next();
        if(!Pattern.matches(regex,cadena)){
            next(msj,regex);
        }
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
    public static String formatoFecha(LocalDate fecha){
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd'/'mm'/'yyyy", Locale.of("ES"));
        return fecha.format(f);
    }
    
    public static LocalDate nextDate(String msj){
        System.out.println(msj);
        LocalDate fecha = null;
        int dia=nextInt("Introduce el dia");
        int mes=nextInt("Introduce el mes");
        int ano=nextInt("Introduce el anio");
        try{
            fecha= LocalDate.of(dia,mes,ano);
        }
        catch(DateTimeException e){
            System.out.println("fecha incorrecta");
            nextDate(msj);
        } 
        return fecha;
    }
    

}
