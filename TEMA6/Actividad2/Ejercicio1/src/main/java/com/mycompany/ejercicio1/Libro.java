/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM121
 */
public class Libro extends Publicacion {
    private int numPaginas;
    
    public Libro(String titulo, String autor, int ano,int mes,int dia,int numPaginas){
        super(titulo, autor, ano,mes, dia);
        this.numPaginas=numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString()+ " numPaginas=" + numPaginas;
    }
    
    
    
}
