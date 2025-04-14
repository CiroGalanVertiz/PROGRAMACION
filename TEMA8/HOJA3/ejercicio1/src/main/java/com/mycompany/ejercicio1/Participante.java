/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author cococ
 */
public class Participante {
    private String DNI;
    private String nombre;
    private Actividad actividad;

    public Participante(String DNI, String nombre, Actividad actividad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.actividad = actividad;
    }
    public Participante(String DNI,Actividad actividad) {
        this.DNI = DNI;
        this.nombre = Teclado.nextLine("Inserta tu nombre");
        this.actividad =actividad;
    }

    public Participante() {
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public Actividad getActividad() {
        return actividad;
    }
    
    
    
}
