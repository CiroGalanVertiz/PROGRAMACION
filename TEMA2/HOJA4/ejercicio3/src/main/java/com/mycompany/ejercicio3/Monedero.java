/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author cococ
 */
public class Monedero {
    private double dinero;

    public Monedero(double dinero) {
        this.dinero = dinero;
    }
    
    public void meterDinero(double din){
        dinero+= din>0? din:0;
        String cadena = din>0?"Operacion realizada con exito":"Numero incorrecto";
        System.out.println(cadena);
    }
    public void sacarDinero(double din){
        dinero-= dinero>din? din:0;
        String cadena = dinero>din?"Operacion realizada con exito":"Dinero insuficiente";
        System.out.println(cadena);
    }
    public void printMonedero(){
        System.out.printf("%s%,.2f%s","tienes: ",dinero,"€" );
    }
    
}
