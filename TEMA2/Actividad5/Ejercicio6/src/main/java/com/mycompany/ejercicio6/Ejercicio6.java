/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto="";
        String caracter=teclado.next();
        while(!caracter.equals(".")){
            texto+=caracter+" ";
            caracter=teclado.next();
            
        }
        System.out.println(texto);
    }
}
