/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Donativo {

    private String DNI;
    private String nombre;
    private double importe;
    private static Scanner teclado=new Scanner(System.in);
    public Donativo() {
        System.out.println("Introduce el dni:");
        this.DNI = teclado.next();
        System.out.println("introduce el nombre:");
        this.nombre = teclado.next();
        System.out.println("introduce el importe: ");
        this.importe = teclado.nextDouble();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
