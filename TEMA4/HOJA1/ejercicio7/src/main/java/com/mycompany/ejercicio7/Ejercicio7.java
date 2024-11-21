/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        int[] array = new int[10];
        int aux2=0;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
           array[i] = r.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
             System.out.println("valor " + (i + 1) + ": "+array[i]);
        }
        for (int i = 0; i < array.length; i++) {
           for (int j = 0; j < array.length; j++) {
          if(array[i]<array[j]){
              aux2=array[i];
              array[i]=array[j];
              array[j]=aux2;
          }
        }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
