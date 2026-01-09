/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenud3;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class ExamenUD3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion=0;
        String nombre="";
        int fNac=0;
        int categoria=0;
        Sanitario s1 = null;
        System.out.println("--- HOSPITAL ---");
        do{
            System.out.println("1- Peticion de datos del empleado");
        System.out.println("2- Crear un objeto sanitario");
        System.out.println("3- Mostrar datos del empleado");
        System.out.println("4- Mostrar Sueldo");
        System.out.println("5- Mostrar Cadena de UIIman");
        System.out.println("6- Salir");
        opcion = teclado.nextInt();
        switch(opcion){
            case 1->{
                System.out.println("Introduce tu nombre");
                nombre=teclado.next();
                while(fNac<0){
                  System.out.println("Introduce tu anio de nacimiento");
                fNac=teclado.nextInt();  
                }
                while(categoria<1 || categoria>3){
                System.out.println("Introduce tu categoria:\n1- Auxiliar\n2- Enfermero\n3- Medico");
                categoria=teclado.nextInt();
            }
               
        }
            case 2->{
                s1 = new Sanitario(nombre,fNac,categoria);
                System.out.println("Sanitario creado");
            }
            case 3->{
                System.out.println(s1.imprimirDatos());
            }
            case 4->{
                int numHijos=-1;
                 while(numHijos<0){
                System.out.println("Introduce el numero de hijos");
                numHijos=teclado.nextInt();
            }if(numHijos<0){
                System.out.println("numero incorrecto");
            }
            System.out.printf("%,.02f€\n",s1.calcularSueldo(numHijos));
            }
            case 5->{
                System.out.println(s1.conjeturadeUIIman());
            }
            default->{
                System.out.println("Numero incorrecto");
            }
        }
        }while(opcion!=6);
        System.out.println("Adios");
        
    
        
    }
}
