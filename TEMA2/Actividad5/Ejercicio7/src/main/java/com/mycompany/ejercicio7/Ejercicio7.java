/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador=0;
        int total=0;
        boolean salir=false;
        for (int i = 1;salir==false; i++) {
            int num=teclado.nextInt();
            if(num>0){
                total+=num;
            }
            else{
                salir=true;
                contador=i;
            }
        }
        System.out.println("La media es: "+ total/contador);
    }
}
