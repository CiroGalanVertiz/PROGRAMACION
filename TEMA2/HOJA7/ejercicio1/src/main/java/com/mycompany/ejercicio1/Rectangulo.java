package com.mycompany.ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam1
 */
public class Rectangulo {
    
    private int largo,ancho;

    public Rectangulo() {
    }

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void area(){
        System.out.println("El area del rectangulo son: "+ancho*largo+" cm cuadrados");
    }
     public void diagonal(){
         double diagonal = Math.sqrt(Math.sqrt(largo)+Math.sqrt(ancho));
         System.out.printf("%s%,.2f%s","La diagonal mide: ",diagonal," cm");
     }
}
