/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = new Scanner(System.in).nextLine();
        Ejercicio4.printMitad(cadena);
    }
    public static void printMitad(String cadena){
        int mitad= cadena.length()/2;
        System.out.println(cadena.substring(0,mitad));
    }
}
