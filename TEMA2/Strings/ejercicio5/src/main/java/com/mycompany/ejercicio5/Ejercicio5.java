/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;


import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String cadena = new Scanner(System.in).nextLine();
        Ejercicio5.cambiarEs(cadena);
        
   
    }
    public static void cambiarEs(String cadena){
        
        System.out.println(cadena.replaceAll("es","no por"));
    }
}
