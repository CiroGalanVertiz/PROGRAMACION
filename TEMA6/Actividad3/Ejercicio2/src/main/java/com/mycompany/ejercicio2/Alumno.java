/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
public class Alumno extends Persona {

    private int[] notas;

    public Alumno(String dni, String nombre, String direccion, int[] notas) {
        super(dni, nombre, direccion);
        this.notas = notas;
    }

    private double notaMedia() {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.length;
    }

    @Override
    public void mostrar() {
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Nota media: " + notaMedia());
    }
}

