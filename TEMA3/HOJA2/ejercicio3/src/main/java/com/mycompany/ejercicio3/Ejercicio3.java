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
        int opcion=new Scanner(System.in).nextInt();
        int numero=new Scanner(System.in).nextInt();
        String respuesta = switch(opcion){
            case 1 ->"El cuadrado de "+numero+" es "+Math.pow(numero,2);
            
            
            case 2 ->"El doble de "+numero+" es "+numero*2;
            
                
            case 3 ->"La raiz cuadrada de "+numero+" es "+Math.sqrt(numero);
                
            default ->"Numero incorrecto";
            
        };
        System.out.println(respuesta);
    }
}
