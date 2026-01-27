/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
public class Profesor extends Persona {

    private String[] asignaturas;

    public Profesor(String dni, String nombre, String direccion, String[] asignaturas) {
        super(dni, nombre, direccion);
        this.asignaturas = asignaturas;
    }

    @Override
    public void mostrar() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Asignaturas:");

        for (String asignatura : asignaturas) {
            System.out.println("- " + asignatura.toUpperCase());
        }
    }
}
