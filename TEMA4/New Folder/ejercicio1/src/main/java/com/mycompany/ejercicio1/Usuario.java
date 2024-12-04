/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Viaje[] viajesRealizados;

    public Usuario(String nombre, String apellido1, String apellido2,int numViajes) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.viajesRealizados = new Viaje[numViajes];
    }
    
    
}
