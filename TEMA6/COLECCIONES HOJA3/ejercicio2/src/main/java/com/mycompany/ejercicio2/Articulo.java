/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.Objects;

/**
 *
 * @author DAM120
 */
public class Articulo {
    private String codigo;
    private String descripcion;
    private int existencias;
     
    public Articulo(){
        this.codigo = Teclado.next("Introduce el codigo del articulo");
        this.descripcion = Teclado.next("Introduce la descripcion del articulo");
        this.existencias = Teclado.nextInt("Introduce la cantidad de existencias del articulo");
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigo);
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
        final Articulo other = (Articulo) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", existencias=" + existencias + '}';
    }

    public int getExistencias() {
        return existencias;
    }
    
    
}
