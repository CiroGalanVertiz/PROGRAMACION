/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author DAM120
 */
public class Persona {
    private final String nombre;
    private final LocalDate fnac;
    private final String DNI;

    public Persona() {
        this.nombre = Teclado.next("Introduce el nombre","[a-zA-Z0-9]{3,}");
        this.fnac = Teclado.nextDate("Introduce la fecha de nacimiento");
        this.DNI = Teclado.nextDNI("Introduce el DNI");
    }
    
    
    
}
