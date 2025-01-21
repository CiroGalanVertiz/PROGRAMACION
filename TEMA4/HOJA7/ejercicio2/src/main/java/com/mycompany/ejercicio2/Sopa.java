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
public class Sopa {
    private char[][] matriz;
    Random r;
    public Sopa(){
        r= new Random();
       matriz=new char[10][20];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char)((char) r.nextInt(90-65+1)+65);
            }
        }
    
}
    public Sopa(int filas,int columnas){
        r= new Random();
       matriz=new char[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char)((char) r.nextInt(90-65+1)+65);
            }
        }
    }
    public void mostrar(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void setPalabra(String palabra,int x,int y,int d){
        char[] array= palabra.toUpperCase().toCharArray();
        if(d==1){
            if((y+palabra.length())<=matriz[y].length){
                for (int i = 0; i < array.length; i++) {
                    matriz[x][y+i]=array[i];
                }
            }
            else{
                System.out.println("la palabra no entra");
            }
        }
        else if(d==-1){
            if((x+palabra.length())<=matriz[y].length){
                for (int i = 0; i < array.length; i++) {
                    matriz[x+i][y]=array[i];
                }
            }
            else{
                System.out.println("la palabra no entra");
            }
        }
        else{
            System.out.println("no se ha introducido bien la direccion");
        }
    }
}
