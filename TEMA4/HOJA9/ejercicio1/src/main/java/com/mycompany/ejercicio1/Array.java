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
        System.out.println();
    }
    public void introducir(){
        this.vector=new int[10];
        int n;
        for (int i = 0; i < vector.length;) {
            System.out.println("introduce el valor "+(i+1)+":");
            n=new Scanner(System.in).nextInt();
            if(n>=0){
                this.vector[i]=n;
                i++;
            }
            else{
                System.out.println("numero incorrecto");
            }
        }
    }
    public void modifcar(int num,int posicion){
        this.vector[posicion]=num;
    }
    public void rotarIzquierda(){
        int guarda = this.vector[0];
        for (int i = 0; i < this.vector.length-1; i++) {
            this.vector[i]=this.vector[i+1];
        }
        this.vector[this.vector.length-1]=guarda;
        System.out.println();
    }
    public void rotarDerecha(){
        int guarda = this.vector[this.vector.length-1];
        for (int i = this.vector.length-1; i >0 ; i--) {
            this.vector[i]=this.vector[i-1];
        }
        this.vector[0]=guarda;
        System.out.println();
    }
    public void comparar(Array a){
        System.out.println("Valores en comun:");
        for (int i = 0; i < this.vector.length; i++) {
            if (a.vector[i]==this.vector[i]){
                System.out.println(this.vector[i]);
            }
        }
        System.out.println();
    }
    public void sumaPares(){
        System.out.println("Suma total de los pares:");
        int sumaPares=0;
        for (int i = 0; i < this.vector.length; i++) {
            if(this.vector[i]%2==0){
                sumaPares+=this.vector[i];
            }
        }
        System.out.println(sumaPares);
        System.out.println();
    }
    public void multiplos(int num){
        System.out.println("Multiplos de "+num+":");
        for (int i = 0; i <this.vector.length; i++) {
            this.vector[i]=(i+1)*num;
            System.out.println(this.vector[i]);
        }
        System.out.println();
    }
    
}
