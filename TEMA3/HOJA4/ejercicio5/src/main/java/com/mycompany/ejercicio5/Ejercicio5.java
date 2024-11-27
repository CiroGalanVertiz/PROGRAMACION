/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Random;

/**
 *
 * @author dam1
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Random r= new Random();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int numero=0;
        for (int i = 0; i < 10; i++) {
            numero = r.nextInt(100)+1;
            System.out.println(numero);
            if (numero<min){
                min=numero;
            }
            if (numero>max){
                max=numero;
            }
        }
        System.out.println("La edad mayor es: "+max);
        System.out.println("La edad menor es: "+min);
    }
}
