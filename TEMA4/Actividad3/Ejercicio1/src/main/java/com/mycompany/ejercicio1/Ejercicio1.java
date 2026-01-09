/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("Escribe un numero");
            int num = teclado.nextInt();
        }
        catch(Exception e){
            System.out.println("eso no es un numero");
            main(args);
        }
    }
}
