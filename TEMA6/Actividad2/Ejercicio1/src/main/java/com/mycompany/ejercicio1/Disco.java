/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM121
 */
public class Disco extends Publicacion {
    
    private int duracionMinutos;

    public Disco( String titulo, String autor, int ano, int mes, int dia,int duracionMinutos) {
        super(titulo, autor, ano, mes, dia);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return super.toString()+ " duracionMinutos=" + duracionMinutos;
    }
    
}
