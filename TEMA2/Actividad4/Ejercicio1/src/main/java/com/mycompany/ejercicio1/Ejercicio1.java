/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7");
        int numero = teclado.nextInt();
        switch(numero){
            case 1-> {
                System.out.println("Lunes");
            }
            case 2-> {
                System.out.println("Martes");
            }
            case 3-> {
                System.out.println("Miercoles");
            }
            case 4-> {
                System.out.println("Jueves");
            }
            case 5-> {
                System.out.println("Viernes");
            }
            case 6-> {
                System.out.println("Sabado");
            }
            case 7-> {
                System.out.println("Domingo");
            }
            default->{
                System.out.println("Numero no valido");
            }
        }
    }
}
