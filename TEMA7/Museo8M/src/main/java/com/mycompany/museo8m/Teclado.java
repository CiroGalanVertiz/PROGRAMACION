/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAM121
 * @param <T>
 */
public class Teclado<T> {
    private final static Scanner teclado= new Scanner(System.in);
     public static String nextLine(String msj){
         System.out.println(msj);
         String cadena=teclado.nextLine();
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
     public static double nextDouble(String msj){
         System.out.println(msj);
         double a=0;
         try{
             a=teclado.nextInt();
             teclado.nextLine();
         }
         catch(InputMismatchException e){
             System.out.println("eso no es un numero");
         }
         return a;
     }
     public static LocalDate nextDate(String msj) {
         System.out.println(msj);
        LocalDate fecha=null;
        try {

            int dia = nextInt("Día: ");
            int mes = nextInt("Mes: ");
            int anio = nextInt("Año: ");

            fecha= LocalDate.of(anio, mes, dia);

        } catch (DateTimeException e) {
            System.out.println("Fecha no válida, inténtalo otra vez.\n");
        }
        return fecha;
    
}
     public static <T> T nextEnum(String msj,List<T> valores){
         String a=Teclado.nextLine(msj);
         T t=null;
         boolean encontrado=false;
         try{
             Iterator<T> it =valores.iterator();
             
             while(it.hasNext() && !encontrado){
                 
                 if(a.equals(it.toString())){
                     t=it.next();
                     encontrado=true;
                 }
             }
         
         }
         catch(NullPointerException e){
             System.out.println("no esta en los valores");
         }
         return t;
         
     }
}
