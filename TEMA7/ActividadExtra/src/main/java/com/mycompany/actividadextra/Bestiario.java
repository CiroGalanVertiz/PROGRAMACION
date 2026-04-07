/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadextra;

/**
 *
 * @author DAM121
 */
import java.util.TreeMap;

public class Bestiario {
    private final TreeMap<ClaveCriatura, Criatura> criaturas;

    public Bestiario() {
        this.criaturas = new TreeMap<>();
    }

    public void agregarCriatura(Criatura c) {
        if (c == null) return;
        ClaveCriatura clave = new ClaveCriatura(c.getNombre(), c.getNivel());
        if (criaturas.containsKey(clave)) {
            System.out.println("Error: Ya existe una criatura con esa clave.");
        } else {
            criaturas.put(clave, c);
            System.out.println("Criatura añadida correctamente.");
        }
    }

    public void eliminarCriatura(String nombre, int nivel) {
        ClaveCriatura clave = new ClaveCriatura(nombre, nivel);
        if (criaturas.containsKey(clave)) {
            criaturas.remove(clave);
            System.out.println("Criatura eliminada correctamente.");
        } else {
            System.out.println("Error: No existe una criatura con esa clave.");
        }
    }

    public void mostrarCriaturas() {
        if (criaturas.isEmpty()) {
            System.out.println("El bestiario está vacío.");
            return;
        }
        System.out.println("\n=== BESTIARIO ORDENADO ===");
        for (var entry : criaturas.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
