/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM120
 */
public class Multiplicar {
    private int[][] numeros;
    public Multiplicar(){
        numeros = new int[10][10];
        for (int i = 1; i < numeros.length; i++) {
            for (int j = 1; j < numeros[i].length; j++) {
                numeros[i][j]=0;
           }
        }
        System.out.println();
    }
    public void multiplica(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[0][i]=i;
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i][0]=i;
        }
        for (int i = 1; i < numeros.length; i++) {
            for (int j = 1; j < numeros[i].length; j++) {
                numeros[i][j]=numeros[i][0]*numeros[0][j];
           }
        }
        System.out.println();
    }
    public void muestra(){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void valoresAspa(){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(i==j || i+j==numeros.length-1){
                   System.out.print(numeros[i][j]); 
                }
                System.out.print("\t");
                
            }
            System.out.println();
        }
        System.out.println();
    }
    public void tablaMultiplicar(int num){
        for (int i = 1; i < numeros.length; i++) {
            System.out.print(numeros[num][i]+" ");
        }
    }
    
}
