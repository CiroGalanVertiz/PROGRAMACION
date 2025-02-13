/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Random r = new Random();
        double apuesta=0;
        int numero=0;
        boolean salir=false;
        while(!salir){
         
        System.out.println("introduce la cantidad a apostar");
        apuesta = new Scanner(System.in).nextDouble();
        numero = r.nextInt(2)+1;
        if (numero==1){
            System.out.println("¡ganaste "+apuesta*2+ "!");
            apuesta+=apuesta*2;
        }
        else{
            System.out.println("Perdiste!");
            apuesta=0;
        }
        System.out.println("¿Quieres volver a intentarlo? S/N");
        String cadena=new Scanner(System.in).next().substring(0,1);
        if(cadena.equalsIgnoreCase("N")){
            System.out.println("Adios");
            salir=true;
        }

        
    }
}
}
