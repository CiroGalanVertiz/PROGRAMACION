/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio7 {

    public static void main(String[] args) {
       boolean salir=false;
       int numero=0;
       int opcion=0;
       int respuesta=0;
       int c=0;
       while (!salir){
           System.out.println("1 - contar cuantas cifras tiene");
           System.out.println("2 - escribe sus 10 primerosmultiplos");
           System.out.println("3 - decir si es perfecto");
           System.out.println("4 - salir");
        opcion=new Scanner(System.in).nextInt();
        switch(opcion){
            case 1 ->{
                c=1;
                System.out.println("Introduce un numero: ");
                numero=new Scanner(System.in).nextInt();
                while(numero>=10){
                    c++;
                    numero/=10;
                }
                System.out.println("El numero introducido tiene "+c+" cifras\n");   
            }
            case 2 ->{
                System.out.println("Introduce un numero: ");
                numero=new Scanner(System.in).nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero+" x "+i+" = "+(numero*i));
                }
                System.out.println();
                
            }
            case 3 ->{
                System.out.println("Introduce un numero: ");
                numero=new Scanner(System.in).nextInt();
                for (int i = 1; i <= numero/2; i++) {
                    if(numero%i==0){
                        respuesta+=i;
                    }      
                }
               if(respuesta==numero){
                   System.out.println("Es un numero perfecto");
               }
               else{
                   System.out.println("No es un numero perfecto");
               }
                System.out.println();
                
            }
            case 4 ->{
                System.out.println("Adios");
                salir=true;
            }
            default -> {
                System.out.println("numero incorrecto");
            }
        }
       }
       
    }
}
