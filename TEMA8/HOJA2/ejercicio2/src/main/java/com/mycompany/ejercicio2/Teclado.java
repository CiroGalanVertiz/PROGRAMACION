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
 * @author cococ
 */
public class Teclado {
    public static String nextLine(String msj){
        System.out.println(msj);
    return new Scanner(System.in).nextLine();
    }
    
    public static String nextLine(String msj,String regex){
        String a =new Scanner(System.in).nextLine();
        if(!Pattern.matches(regex,a)){
            System.out.println("formato incorrecto");
            nextLine(msj,regex);
        }
        return a;
        
    }
    public static int nextInt(String msj){
        System.out.println(msj);
        int a=0;
        try{
            a=new Scanner(System.in).nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("eso no es un numero");
            nextInt(msj);
        }
        return a;
    }
   
}
