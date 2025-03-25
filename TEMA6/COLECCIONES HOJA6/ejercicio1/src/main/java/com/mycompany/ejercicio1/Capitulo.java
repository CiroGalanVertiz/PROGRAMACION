/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Capitulo {
    private int numTmp;
    private int numCap;
    private String descripcion;

    public int getNumTmp() {
        return numTmp;
    }

    public void setNumTmp(int numTmp) {
        this.numTmp = numTmp;
    }

    public int getNumCap() {
        return numCap;
    }

    public void setNumCap(int numCap) {
        this.numCap = numCap;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.numTmp;
        hash = 97 * hash + this.numCap;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean aux=false;
        if (this == obj) {
            aux= true;
        }
        if (obj == null) {
            aux= false;
        }
        if (getClass() != obj.getClass()) {
            aux= false;
        }
        final Capitulo other = (Capitulo) obj;
        return this.numCap == other.numCap && this.numTmp==other.numTmp;
    }
    
}
