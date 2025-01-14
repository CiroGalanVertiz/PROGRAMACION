/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM120
 */
public class Array {
    private int[] vector;
    public void mostrar(){
        for(int i:this.vector){
            System.out.println(i);
        }
    }
    public void introducir(){
        this.vector=new int[10];
        int n;
        for (int i = 0; i < vector.length;) {
            System.out.println("introduce el valor "+(i+1)+":");
            n=new Scanner(System.in).nextInt();
            if(n>=0){
                i++;
            }
            else{
                System.out.println("numero incorrecto");
            }
        }
    }
    public void introducir(int num,int posicion){
        
    }
    public void rotarIzquierda(){
        
    }
    public void rotarDerecha(){
        
    }
    public void comparar(){
        
    }
    public void sumaPares(){
        
    }
    public void multiplos(){
        
    }
    
}
