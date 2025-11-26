/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM121
 */
public class Circulo {
    //atributos
    private double radio;

    //constructores
    public Circulo(){
    }

    public Circulo(double radio){
        this.radio = radio;
    }

    //métodos
    //obtener el radio
    public double getRadio(){
        return radio;
    }

    // establecer el radio
    public void setRadio(double radio){
        this.radio = radio;
    }

    //calcular el area del círculo
    public double area(){
        return 2 * Math.PI * Math.pow(radio, 2);
    }

    public double longitud(){
        return 2 * Math.PI * radio;
    }
}

