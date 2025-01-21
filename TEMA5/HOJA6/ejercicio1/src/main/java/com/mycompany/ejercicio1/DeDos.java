/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class DeDos implements Series {
    private int valor;
    private int anterior;
    
    public DeDos(){
        valor=Series.inicio;
        anterior=valor-2;
    }

    @Override
    public int getSiguiente() {
        return valor+2;
    }

    @Override
    public void reiniciar() {
        this.valor=Series.inicio;
        this.anterior=valor-2; 
    }

    public int getAnterior() {
        return this.valor-2;
    }

    @Override
    public void setComenzar(int x) {
        this.valor=x;
        this.anterior=valor-2;
        
    }

    @Override
    public void mostrarInicio() {
        Series.super.mostrarInicio();
    }
    
}
