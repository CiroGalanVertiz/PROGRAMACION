/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM121
 */
public class Programador extends Empleado{
    private int lineasdeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
        super();
    }

    public Programador(String nombre, String departamento, int edad, boolean casado, double salario,int lineasdeCodigoPorHora, String lenguajeDominante) {
        super(nombre, departamento, edad, casado, salario);
        this.lineasdeCodigoPorHora = lineasdeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasdeCodigoPorHora() {
        return lineasdeCodigoPorHora;
    }

    public void setLineasdeCodigoPorHora(int lineasdeCodigoPorHora) {
        this.lineasdeCodigoPorHora = lineasdeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    
    
    
    
    
    
}
