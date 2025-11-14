/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu de opciones");
        System.out.println("1. Calcular el doble del numero");
        System.out.println("2. Calcular el doble del numero");
        System.out.println("3. Calcular la raiz cuadrada del numero");
        System.out.print("Elige una opcion(1-3):");
        int opcion = teclado.nextInt();
        System.out.println("Escribe un numero");
        int num = teclado.nextInt();
        switch(opcion){
            case 1->{
                System.out.println(num*num);
            }
            case 2->{
                System.out.println(num*2);
            }
            case 3->{
                Math.sqrt(num);
            }
            default ->{
                System.out.println("Numero incorrecto");
            }
            
        }
    }
}
