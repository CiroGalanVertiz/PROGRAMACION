/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.Random;

/**
 *
 * @author DAM120
 */
public class Tabla {
    private int[][] matriz= new int[4][5];
    Random r= new Random();
    public Tabla(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               matriz[i][j]=r.nextInt(100)+1;
            }
        }
    }
    public String mostrar(){
        String cadena="";
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                cadena+= j ==matriz[i].length-1 ? matriz[i][j]:matriz[i][j]+"\t";
            }
           cadena+="\n";
        }
        return cadena;
    }
    public void mayorF(int fila){
        int mayor=0;
        for (int i = 0; i < matriz[fila].length; i++) {
            if(matriz[fila][i]>mayor){
                mayor=matriz[fila][i];
            }
        }
        System.out.println("Elnumero mayor de la fila "+fila+" es "+mayor);
    }
    public void mayorC(int columna){
        int mayor=0;
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i][columna]>mayor){
                mayor=matriz[i][columna];
            }
        }
        System.out.println("Elnumero mayor de la columna "+columna+" es "+mayor);
    }
    public void media(){
        int totalNumeros=0;
        int sumatorio=0;
        double media=0;
        for (int i = 0; i < matriz.length; i++) {
            totalNumeros+= matriz[i].length;
            for (int j = 0; j < matriz[i].length; j++) {
                sumatorio+=matriz[i][j];
            }
        }
        media=sumatorio/totalNumeros;
        System.out.println("La media es "+media);                
    }
    
}
