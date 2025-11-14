/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        double num = new Scanner(System.in).nextDouble();
        if((num+1)- num < 1 && (num+1)- num > 0){
            System.out.println("la parte fraccionaria es" + ((num+1)- num));
    }
    else{
            System.out.println("No tiene parte fraccionaria");
}
}
}
