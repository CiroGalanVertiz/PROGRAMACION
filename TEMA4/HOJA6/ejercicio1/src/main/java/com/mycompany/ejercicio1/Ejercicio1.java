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
        int[][] matriz={{101,102,103,104,105},{201,202,203,204,205},{301,302,303,304,305},{401,402,403,404,405},{501,502,503,504,505}};
        int opcion=0;
        int numero=0;
        boolean salir=false;
        while(!salir){
            System.out.println("---Menu---");
            System.out.println("1- Ver columna");
            System.out.println("2- Ver fila");
            System.out.println("3- Mostrar diagonal");
            System.out.println("4- Mostrar diagonal inversa");
            System.out.println("5- Mostrar diagonal hacia arriba");
            System.out.println("6- salir");
          opcion= new Scanner(System.in).nextInt();
          switch (opcion){
              case 1->{
                  
                   System.out.println("Introduce numero de la fila");
                  numero = new Scanner(System.in).nextInt();
                  for (int i = 0; i < matriz.length; i++) {
                      System.out.println(matriz[i][numero-1]);
                  }
              }
              case 2->{
                 System.out.println("Introduce numero de la columna");
                  numero = new Scanner(System.in).nextInt();
                  for (int i = 0; i < matriz[numero-1].length; i++) {
                      System.out.println(matriz[numero-1][i]);
                  }
              }
              case 3->{
                  for (int i = 0; i < matriz.length; i++) {
                      System.out.println(matriz[i][i]);
                  }
                  
              }
              case 4->{
                  for (int i = matriz.length-1; i >=0; i--) {
                      System.out.println(matriz[i][i]);
                  }
              }
                  
              case 5->{
                  for (int i = matriz.length-1,j=0; i>=0; i--,j++) {
                      System.out.println(matriz[i][j]);
                  }
              }
              case 6->{
                  salir=true;
                  System.out.println("adios");
              }
              default->{
                  System.out.println("numero incorrecto");
              }
          }
        }
        
    }
}
