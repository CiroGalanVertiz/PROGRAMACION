/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cococ
 */
public class Entrada {
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
    public static int nextInt(String msj,int numMin,int numMax) {
        System.out.println(msj);
        int a = 0;
        try {
            a = new Scanner(System.in).nextInt();
            if(a<numMin && a>numMax){
                throw new Exception("numero fuera de rango");
            }
        } catch (InputMismatchException e) {
            System.out.println("Numero incorrecto");
            nextInt(msj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            nextInt(msj,numMin,numMax);
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
    public static boolean nextBoolean(String msj) {
        System.out.println(msj);
        boolean respuesta=false;
        String cadena = new Scanner(System.in).nextLine();
        if(cadena.equalsIgnoreCase("SI")){
            respuesta=true;
        }
        return respuesta;
    }
}
