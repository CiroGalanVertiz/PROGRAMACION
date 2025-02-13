/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int mayor=0;
       
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("valor " + (i + 1) + ":");
            array[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(mayor<array[i]){
            mayor=array[i];
        }        
        }
        System.out.println("El numero mayor es: "+ mayor); 
    }
    }

