/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
public abstract class Persona {

    private String dni;
    private String nombre;
    private String direccion;

    public Persona() {
        // En un caso real se podrían pedir por teclado,
        // aquí lo dejamos preparado para setters
    }

    public Persona(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método mostrar
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
}

