/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM121
 */
public class CajaAhorro {
    private float saldo;
    private int transacciones;

    
    public void depositar (float cantidad){
        this.saldo += cantidad;
        transacciones++;
    }

   
    public void girar (float cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("No puede realizar el giro NO dispone ese dinero");
        } else {
            this.saldo -= cantidad;
            transacciones++;
        }
    }

    
    public float obtenerSaldo(){
        return saldo;
    }

    
    
    public int obtenerTransacciones(){
        return transacciones;
    }

    
    public CajaAhorro(){
        this.saldo = 0;
        this.transacciones = 0;
    }
}

