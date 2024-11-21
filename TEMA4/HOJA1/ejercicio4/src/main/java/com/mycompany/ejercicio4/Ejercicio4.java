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
       int[] array = new int[10];
       int[] array2 =new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("valor "+(i+1)+":");
            array[i]=new Scanner(System.in).nextInt();
        }
        System.out.println("Array 1:");
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            
            
        
        }
        System.out.println();
        System.out.println("Array 2:");
        for (int i = 0,j= array.length-1; i < array2.length; i++,j--) {
            array2[i]=array[j]; 
        }
       
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
