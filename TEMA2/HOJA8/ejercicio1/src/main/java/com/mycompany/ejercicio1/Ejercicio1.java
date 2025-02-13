/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Introduce tu nombre"); 
        String nombre=new Scanner(System.in).nextLine(); 
        System.out.println("Introduce tu primer apellido"); 
        String ape1=new Scanner(System.in).nextLine(); 
        System.out.println("Introduce tu segundo apellido"); 
        String ape2=new Scanner(System.in).nextLine(); 
        System.out.println("Introduce tu DNI"); 
        String dni=new Scanner(System.in).nextLine(); 
        Persona P1=new Persona(nombre,ape1,ape2,dni); 
        System.out.println("Tu clave es: "+P1.clave()); 
        System.out.println("Tu DNI es: "+P1.dniValido()); 
    } 
    }

