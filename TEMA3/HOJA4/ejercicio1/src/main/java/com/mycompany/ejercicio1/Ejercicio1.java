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
        
        boolean salir=false;
                while(!salir){
                    System.out.println("1 - Divisores");
                    System.out.println("2 - Impares");
                    System.out.println("3 - Tabla de multiplicar");
                    System.out.println("4 - Division con restas");
                    System.out.println("5 - Salir");
                    int numero = new Scanner(System.in).nextInt();
                    
                    switch (numero) {
                        case 1 ->{
                            System.out.println("Introduce un numero");
                            Calculo.metodo1(new Scanner(System.in).nextInt());
                            System.out.println();
                        }
                            
                        case 2 ->{
                            System.out.println("Introduce numero 1");
                            int num1=new Scanner(System.in).nextInt();
                            System.out.println("Introduce numero 2");
                            int num2=new Scanner(System.in).nextInt();
                            Calculo.metodo2(num1,num2);
                            System.out.println();
                        }
                            
                        case 3 ->{
                            System.out.println("Introduce un numero");
                            Calculo.metodo3(new Scanner(System.in).nextInt());
                            System.out.println();
                        }
                            
                        case 4 ->{
                            System.out.println("Introduce numero 1");
                            int num1=new Scanner(System.in).nextInt();
                            System.out.println("Introduce numero 2");
                            int num2=new Scanner(System.in).nextInt();
                            Calculo.metodo4(num1,num2);
                            System.out.println();
                        }
                        case 5 ->{
                            System.out.println("Adios");
                            salir=true;
                        }
                      
                        default ->{
                            System.out.println("Numero incorrecto");
                        }
                            
                    }
                }
    }
}
