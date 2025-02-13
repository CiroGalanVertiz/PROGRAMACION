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
        int euros=0;
        int donativos=0;
        while (euros<600){
            System.out.println("Anade donativos hasta llegar a 600 euros (llevas "+euros+" euros)");
            euros+=new Scanner(System.in).nextInt();
            donativos++;
        }
        System.out.println("Se han necesitado "+donativos+" donativos");
    }
}
