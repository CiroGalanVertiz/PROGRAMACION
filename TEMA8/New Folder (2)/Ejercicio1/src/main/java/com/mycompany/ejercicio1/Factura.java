package com.mycompany.ejercicio1;

import java.io.Serializable;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM121
 */
public class Factura implements Serializable{
    private static Scanner teclado=new Scanner(System.in);
    private int numeroFac;
    private String nombre;
    private double importe;
    private boolean pagado;
    
    public Factura(){
        System.out.println("Introduce el numero de facura:");
        this.numeroFac=teclado.nextInt();
        System.out.println("Introduce el nombre:");
        this.nombre=teclado.next();
        System.out.println("Introduce el importe:");
        this.importe=teclado.nextDouble();
        this.pagado=false;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public int getNumeroFac() {
        return numeroFac;
    }

    public String getNombre() {
        return nombre;
    }

    public double getImporte() {
        return importe;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Factura{" + "teclado=" + teclado + ", numeroFac=" + numeroFac + ", nombre=" + nombre + ", importe=" + importe + ", pagado=" + pagado + '}';
    }
    
    
}
