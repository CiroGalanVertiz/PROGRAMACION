/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.println("Escribe un numero del 0 al 100");
            int num = teclado.nextInt();
            if(num>100 || num<0){
                throw new Exception("numero incorrecto");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
