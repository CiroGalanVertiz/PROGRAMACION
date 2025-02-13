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
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        boolean salir=false;
        int numero;
        String cadena = "Numero no encontrado";
        System.out.println("Introduce el numero a buscar:");
        numero=new Scanner(System.in).nextInt();
        for(int i=0;i<array.length && !salir;i++){
            if(array[i]==numero){
                cadena=numero+" esta en la posicion "+i;
                salir=true;
            }
         
        }
        System.out.println(cadena);
    }
    }

