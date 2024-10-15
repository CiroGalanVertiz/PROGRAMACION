/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String cadena = new Scanner(System.in).nextLine();
        cadena=cadena.replaceAll("a","o");
        cadena=cadena.replaceAll("e","o");
        cadena=cadena.replaceAll("i","o");
        cadena=cadena.replaceAll("u","o");
        System.out.println(cadena);
        
    }
}
