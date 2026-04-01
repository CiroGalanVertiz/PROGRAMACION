/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadassassinscreed;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author cococ
 */

public class Gremio {
    private Set<Asesino> asesinos = new LinkedHashSet<>();
    private List<Artefacto> inventario = new LinkedList<>();

    public boolean insertarAsesino(Asesino a) {
        return asesinos.add(a);
    }

    public boolean eliminarAsesino(String nombre) {
        for (Asesino a : asesinos) {
            if (a.getNombre().equals(nombre)) {
                asesinos.remove(a);
                return true;
            }
        }
        return false;
    }

    public void mostrarAsesinos() {
        System.out.println("LISTADO DE ASESINOS");
        for (Asesino a : asesinos) {
            System.out.println(a);
        }
    }

    public void agregarAInventario(Artefacto art) {
        inventario.add(art);
    }

    public void mostrarInventario() {
        System.out.println("CONTENIDO DEL INVENTARIO");
        for (Artefacto a : inventario) {
            System.out.println(a);
        }
    }

    public boolean eliminarDeInventario(String nombre) {
        Iterator<Artefacto> it = inventario.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(nombre)) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
