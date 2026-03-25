/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Teclado {
    public final static Scanner teclado= new Scanner(System.in);
    public static String nextLine(String msj){
            System.out.println(msj);
            String cadena = teclado.nextLine();
        return cadena;
        
    }
    public static int nextInt(String msj){
        System.out.println(msj);
        int a=0;
        try{
            a=teclado.nextInt();
            teclado.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("eso no es un numero");
        }
           return a;
    }
    
}
