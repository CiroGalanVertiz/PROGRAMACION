/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Random r = new Random();
        boolean salir=false;
        int y= r.nextInt(9999-0+1)+0;
        String contraseña= String.format("%04d",y);
   
        for (int i = 3; i>=0&&!salir; i--) {
            System.out.println("Introduce la contrasena");
            String numero = new Scanner(System.in).next();
            if(numero.equals(contraseña)){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                salir=true;
            }
            else{
                System.out.println("Lo siento, esa no es la combinacion le quedan "+i+" intentos");
            }
        }
    }
}
