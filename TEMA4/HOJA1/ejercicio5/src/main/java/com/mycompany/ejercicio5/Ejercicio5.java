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
        int[] array = new int[5];
       
        for (int i = 0; i < array.length; i++) {
            System.out.println("valor "+(i+1)+":");
            array[i]=new Scanner(System.in).nextInt();
        }
        System.out.println("Array normal:");
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
       
        System.out.println();
        System.out.println("Array invertida:");
        for (int i = 0,j= array.length-1; i < array.length/2; i++,j--) {
            int aux=array[j];
            int aux2=array[i];
            array[i]=aux;
            array[j]=aux2;
            
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
       
        
    }
}
