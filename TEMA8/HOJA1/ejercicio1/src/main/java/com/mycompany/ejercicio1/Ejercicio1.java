/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM120
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Gestion de usuarios:");
        int opcion=0;
        do{
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Agregar");
            System.out.println("4. Listar");
            System.out.println("5. salir");
            
            opcion=new Scanner(System.in).nextInt();
            
            switch (opcion){
                case 1->{
                    
                }
                case 2->{
                    
                }
                case 3->{
                    
                }
                case 4->{
                    
                }
                default->{
                    System.out.println("numero incorrecto");
                }
            }
        }while(opcion!=5);
    }
}
