package com.mycompany.ejercicio1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam120
 */
public class Triatlon {
    private String dorsal;
    private String nombre;
    private int[] puntuaciones;
    private int Npruebas;

    public Triatlon(String dorsal, String nombre,int Npruebas) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.Npruebas =Npruebas;
        this.puntuaciones = new int[Npruebas];
        for (int i = 0; i < this.puntuaciones.length; i++) {
            System.out.println("Prueba numero "+(i+1)+": ");
            puntuaciones[i]=new Scanner(System.in).nextInt();
        }
    }

    public Triatlon() {
        System.out.println("Numero del dorsal: ");
        this.dorsal = new Scanner(System.in).next();
        System.out.println("Nombre del competidor: ");
        this.nombre = new Scanner(System.in).next();
        System.out.println("Numero de pruebas: ");
        this.Npruebas =new Scanner(System.in).nextInt();
        this.puntuaciones = new int[this.Npruebas];
        for (int i = 0; i < this.puntuaciones.length; i++) {
            System.out.println("Prueba numero "+(i+1)+": ");
            puntuaciones[i]=new Scanner(System.in).nextInt();
        }
    }
    public double pMedia(){
        int sumatorio=0;
        for (int i = 0; i < this.puntuaciones.length; i++) {
            sumatorio+=puntuaciones[i];
        }
        return  (double) sumatorio/this.Npruebas;
    }
    
    public boolean esSeleccionado(){
        boolean seleccionado=false;
        for (int i = 0; i < this.puntuaciones.length && !seleccionado; i++) {
            if(this.puntuaciones[i]>10){
                seleccionado=true;
            }
        }
        return seleccionado;
    }
   public String mostrar(){
       String puntos="";
       for (int i = 0; i < this.puntuaciones.length; i++) {
           puntos+= i==(this.puntuaciones.length-1)? puntuaciones[i]:puntuaciones[i]+",";
       }
       return "Dorsal="+this.dorsal+" Nombre="+this.nombre+" Puntos="+puntos+" Media="+String.format("%,.02f",this.pMedia());
   } 
    
    
    
    
}
