/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       System.out.println("Introduce el nombre"); 
        String nombre=new Scanner(System.in).nextLine(); 
        System.out.println("Introduce las grasas"); 
        int grasas=new Scanner(System.in).nextInt(); 
        System.out.println("Introduce los hidratos"); 
        int hidra=new Scanner(System.in).nextInt(); 
        System.out.println("Es de origen animal: si no"); 
        String origen=new Scanner(System.in).nextLine(); 
        boolean origenAni=origen.equals("si")?true:false; 
        Alimento A1=new Alimento(nombre,grasas,hidra,origenAni); 
        System.out.println(A1.toString()); 
        System.out.println("Es dietetico :"+A1.esDietetico()); 
        System.out.println("Introduce el numero de gramos de un alimento para saber sus calorias en gramos"); 
         int calorias=new Scanner(System.in).nextInt(); 
        System.out.println("El numero de calorias es: "+A1.calorias(calorias)); 
    }
}
