/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadassassinscreed;

/**
 *
 * @author cococ
 */
import java.util.Objects;

public class Asesino extends Personaje {
    private int edad;
    private Rango rango;
    private String arma_favorita;

    public Asesino(String nombre, int edad, Rango rango, String arma_favorita) {
        super(nombre);
        this.edad = edad;
        this.rango = rango;
        this.arma_favorita = arma_favorita;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public Rango getRango() { return rango; }
    public void setRango(Rango rango) { this.rango = rango; }
    public String getArma_favorita() { return arma_favorita; }
    public void setArma_favorita(String arma_favorita) { this.arma_favorita = arma_favorita; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asesino asesino = (Asesino) o;
        return Objects.equals(getNombre(), asesino.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    @Override
    public String toString() {
        return "Asesino{nombre=" + getNombre() + ", edad=" + edad +
               ", rango=" + rango + ", arma_favorita=" + arma_favorita + "}";
    }
}