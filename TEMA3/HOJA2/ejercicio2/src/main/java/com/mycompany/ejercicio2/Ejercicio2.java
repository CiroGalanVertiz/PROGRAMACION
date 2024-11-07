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
        System.out.println("Introduce el dia del mes");
        int numero=new Scanner(System.in).nextInt();
        
        String cadena = switch(numero%7){
            case 1 ->"Lunes";
            case 2 ->"Martes";
            case 3 ->"Miercoles";
            case 4 ->"Jueves";
            case 5 ->"Viernes";
            case 6 ->"Sabado";
            default -> "Domingo";
        };
        System.out.println("Dia "+numero+" :"+cadena);
    }
}
