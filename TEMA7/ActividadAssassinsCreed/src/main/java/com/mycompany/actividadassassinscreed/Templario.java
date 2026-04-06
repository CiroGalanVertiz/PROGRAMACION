/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadassassinscreed;

/**
 *
 * @author cococ
 */
public class Templario extends Personaje implements Comparable<Templario> {
    private String organizacion;
    private int nivel_peligrosidad;

    public Templario(String nombre, String organizacion, int nivel_peligrosidad) {
        super(nombre);
        this.organizacion = organizacion;
        this.nivel_peligrosidad = nivel_peligrosidad;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public int getNivel_peligrosidad() {
        return nivel_peligrosidad;
    }

    public void setNivel_peligrosidad(int nivel_peligrosidad) {
        this.nivel_peligrosidad = nivel_peligrosidad;
    }

    
    
    @Override
    public String toString() {
        return "Templario{nombre=" + getNombre() + ", organizacion=" + organizacion +
               ", nivel_peligrosidad=" + nivel_peligrosidad + "}";
    }

    @Override
    public int compareTo(Templario o) {
        return this.nivel_peligrosidad-o.nivel_peligrosidad;
    }
}