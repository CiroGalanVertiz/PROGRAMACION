/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {
    private static Set<String> paises;

    public static void main(String[] args) {
        Mundo m1 = new Mundo();
        
        //Menu repetitivo
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        String nombre="";
        String capital="";
        String poblacion="";
        
        do {
            
            System.out.println("1. Aniadir pais");
            System.out.println("2. Eliminar pais");
            System.out.println("3. Listar paises");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    System.out.println("Nombre del pais:");
                    nombre=teclado.next();
                    System.out.println("Nombre de la capital:");
                    capital=teclado.next();
                    System.out.println("poblacion:");
                    poblacion=teclado.next();
                    m1.agregarPais(new Pais(nombre,poblacion,capital));
                }
                //Opcion 2
                case 2 -> {
                    System.out.println("Nombre del pais:");
                    nombre=teclado.next();
                    System.out.println("Nombre de la capital:");
                    capital=teclado.next();
                    System.out.println("poblacion:");
                    poblacion=teclado.next();
                    m1.eliminarPais(new Pais(nombre,poblacion,capital));
                    
                    
                }
                //Opcion 3
                case 3 -> {
                    m1.mostrarPaises();
                }
                //Opcion por defecto
                default -> {
                    System.out.println("opcion incorrecta");
                }
            }
            
        } while (opcion != 4);
    }
}
