/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;

/**
 *
 * @author DAM121
 */
public class Criatura {
    private String nombre;
    private TipoCriatura tipo;
    private int nivel;

    public Criatura(String nombre, TipoCriatura tipo, int nivel) {
        setNombre(nombre);
        this.tipo = tipo;
        setNivel(nivel);
    }

    // Getters y setters con validación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.length() < 3 || nombre.length() > 25) {
            throw new IllegalArgumentException("El nombre debe tener entre 3 y 25 caracteres.");
        }
        this.nombre = nombre;
    }

    public TipoCriatura getTipo() {
        return tipo;
    }

    public void setTipo(TipoCriatura tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1 || nivel > 99) {
            throw new IllegalArgumentException("El nivel debe estar entre 1 y 99.");
        }
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Nivel: " + nivel;
    }
}