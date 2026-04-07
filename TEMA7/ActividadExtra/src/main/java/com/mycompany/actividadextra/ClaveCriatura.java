/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;
import java.util.Objects;
/**
 *
 * @author DAM121
 */

    

public class ClaveCriatura implements Comparable<ClaveCriatura> {
    private final String nombre;   // almacenado en mayúsculas
    private final int nivel;

    public ClaveCriatura(String nombre, int nivel) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede ser nulo.");
        }
        this.nombre = nombre.toUpperCase();
        this.nivel = nivel;
    }

    @Override
    public int compareTo(ClaveCriatura o) {
        // 1. Orden alfabético por nombre
        int cmpNombre = this.nombre.compareTo(o.nombre);
        if (cmpNombre != 0) {
            return cmpNombre;
        }
        // 2. Si hay empate, nivel de mayor a menor
        return Integer.compare(o.nivel, this.nivel);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClaveCriatura other = (ClaveCriatura) obj;
        return nivel == other.nivel && nombre.equals(other.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nivel);
    }

    @Override
    public String toString() {
        return nombre + "-" + nivel;
    }
}

