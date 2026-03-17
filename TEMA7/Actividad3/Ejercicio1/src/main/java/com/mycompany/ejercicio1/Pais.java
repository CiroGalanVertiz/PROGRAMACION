/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Objects;

/**
 *
 * @author DAM121
 */
public class Pais {
    private String nombre,poblacion,capital;

    public Pais(String nombre, String poblacion, String capital) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.capital = capital;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.poblacion);
        hash = 29 * hash + Objects.hashCode(this.capital);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.poblacion, other.poblacion)) {
            return false;
        }
        return Objects.equals(this.capital, other.capital);
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", poblacion=" + poblacion + ", capital=" + capital + '}';
    }
    
    
}
