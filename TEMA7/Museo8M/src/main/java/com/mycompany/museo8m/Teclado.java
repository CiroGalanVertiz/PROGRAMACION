/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Teclado {
    private static Scanner teclado;
     public static String nextLine(String msj){
         return teclado.nextLine();
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
