/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Introduce el numero de dia de la semana");
        int numero=new Scanner(System.in).nextInt();
        
        String cadena = switch(numero){
            case 1 ->"Lunes";
            case 2 ->"Martes";
            case 3 ->"Miercoles";
            case 4 ->"Jueves";
            case 5 ->"Viernes";
            case 6 ->"Sabado";
            case 7 ->"Domingo";
            default -> "Numero incorrecto";
        };
        System.out.println(cadena);
    }
}
