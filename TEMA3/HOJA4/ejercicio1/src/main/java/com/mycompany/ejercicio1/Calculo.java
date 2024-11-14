/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Calculo {
    public static void metodo1(int numero){
        
        System.out.print("los divisores de "+numero+" son: \n");
        for (int i = numero-1; i > 1; i--) {
            if(numero%i==0)
                System.out.println(i);
        }
   
    }
    public static void metodo2(int numero1,int numero2){
            int menor=Math.min(numero1, numero2);
            int mayor=Math.max(numero1, numero2);
            System.out.println("Los numero impares comprendidos entre "+menor+" y "+mayor+" son: " );
        for (int i = menor; i <= mayor; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
       
    }
    public static void metodo3(int numero){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }
    public static void metodo4(int a, int b){
        int cociente=0;
        int resto=0;
        while(a>=b){
            cociente++;
            a-=b;
        }
        resto=a;
        
        System.out.println("Cociente: "+cociente+"\nResto: "+resto);
        
    }
   
}
