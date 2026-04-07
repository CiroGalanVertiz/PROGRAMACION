/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadassassinscreed;

/**
 *
 * @author cococ
 */
public class Artefacto {
    private String nombre;
    private String origen;
    private String poder;

    public Artefacto(String nombre, String origen, String poder) {
        this.nombre = nombre;
        this.origen = origen;
        this.poder = poder;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getPoder() { return poder; }
    public void setPoder(String poder) { this.poder = poder; }

    @Override
    public String toString() {
        return "Artefacto{nombre=" + nombre + ", origen=" + origen + ", poder=" + poder + "}";
    }
}
