/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Calculo {
    
    private Scanner teclado= new Scanner(System.in);
    
    public void metodo1(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        String cadena;
        if(a>100||a<1000){
            cadena="Esta compredido entre 100 y 1000";
        }
        else{
            cadena="No esta compredido entre 100 y 1000";
        }
        System.out.println(cadena);
    }
    public void metodo2(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        String cadena;
        if(a>0){
            cadena="Es positivo";
        }
        else if(a==0){
            cadena="Es nulo";
        }
        else{
            cadena="Es negativo";
        }
        System.out.println(cadena);
        
    }
    public void metodo3(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        String cadena;
        if(a%(2*5)==0){
            cadena= "Es divisible entre 2 y 5";
        }
        else{
            cadena="No es divisible entre 2 y 5";
        }
        System.out.println(cadena);
        
    }
    public void metodo4(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        String cadena;
        if(a%1!=0){
            cadena = "Tiene parte fraccionaria";
        }
        else{
            cadena = "No tiene parte fraccionaria";
        }
        System.out.println(cadena);
    }
    public void metodo5(){
        System.out.println("Introduce un numero entre 1900 y 2100");
        int a =teclado.nextInt();
        String cadena;
        if(a>1900 && a<2100){
            if(a%4==0 || a%100==0 && a%400!=0){
                cadena="Es bisiesto";
            }
            else{
                cadena="No es bisiesto";
            }
        }
        else{
            cadena="Rango incomprendido";
        }
        System.out.println(cadena);
        
    }
    public void metodo6(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        String cadena;
        if(a%2==0){
            cadena="Es par";
        }
        else{
            cadena="No es par";
        }
        System.out.println(cadena);
        
    }
    public void metodo7(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        String cadena;
        if(a>0 && a<10){
            if(a%2==0){
            cadena="Es par";
        }
        else{
            cadena="No es par";
        }
        }
        else{
            cadena="Rango incomprendido";
        }
        System.out.println(cadena);
    }
    public void metodo8(){
        System.out.println("Introduce un numero ");
        int a =teclado.nextInt();
        System.out.println("Introduce un numero ");
        int b =teclado.nextInt();
        System.out.println("Introduce un numero ");
        int c =teclado.nextInt();
        int max=Math.max(Math.max(a, b),Math.max(b,c));
        int min=Math.max(Math.max(a, b),Math.max(b,c));
        int medio;
        if(a==min && b==max || a==max && b==min){
            medio=c;
        }
        else if(b==min && c==max || b==max && c==min){
            medio=a;
        }
        else{
            medio=b;
        }
        String cadena="Min: "+min+"\nMax: "+max+"\nEl orden es "+min+","+medio+","+max;
        System.out.println(cadena);
    }
    public void metodo9(){
        System.out.println("introduce un dividendo:");
        int divid=teclado.nextInt();
        System.out.println("introduce un divisor:");
        int divis=teclado.nextInt();
        String cadena;
        if(divid%divis==0){
           cadena=divis+" es divisor de "+divid;
        }
        else{
           cadena=divis+" no es divisor de "+divid;
        }
        System.out.println(cadena);
        
    }
   
    
    
}
