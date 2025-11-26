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
        int opcion;
        CajaAhorro c1 = new CajaAhorro();
        float dinero;
       do{
           System.out.println("1 - depositar");
           System.out.println("2 - girar");
           System.out.println("3 - consultar saldo");
           System.out.println("4 - consultar transacciones");
           System.out.println("5 - salir");
           opcion= teclado.nextInt();
           switch(opcion){
               case 1->{
                   System.out.println("¿Cuanto quieres depositar?");
                   dinero = teclado.nextFloat();
                   if(dinero>0){
                   c1.depositar(dinero);
               }
                   else{
                       System.out.println("numero invalido");
                   }
               }
               case 2->{
                    System.out.println("¿Cuanto quieres girar?");
                   dinero = teclado.nextFloat();
                   if(dinero>0){
                   c1.girar(dinero);
               }
                   else{
                       System.out.println("numero invalido");
                   }
               }
               case 3->{
                   System.out.println(c1.obtenerSaldo());
               }
               case 4->{
                   System.out.println(c1.obtenerTransacciones());
               }
               default->{
                   System.out.println("opcion incorrecta");
               }
           }
       }while(opcion!=5);
    }
}
