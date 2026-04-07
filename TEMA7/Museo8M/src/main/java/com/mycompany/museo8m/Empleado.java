/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.time.LocalDate;

/**
 *
 * @author cococ
 */
public class Empleado extends Persona{
    private LocalDate fechaAlta;
    private String numSeguridadSocial;
    private double sueldo;
    
    public Empleado() {
    super();
    this.fechaAlta = Teclado.nextDate("Introduce la fecha de alta: ");
    this.numSeguridadSocial = Teclado.nextLine("Número Seguridad Social: ");
    this.sueldo = Teclado.nextDouble("Sueldo: ");
}

    public String getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public double getSueldo() {
        return sueldo;
    }
    
}
