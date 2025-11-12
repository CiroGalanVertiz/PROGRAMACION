/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicicio6;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        int num = new Scanner(System.in).nextInt();
        if(num%2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
}
