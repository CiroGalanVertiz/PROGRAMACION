/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadassassinscreed;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author cococ
 */

public class Temple {
    private TreeSet<Templario> templarios;

    public Temple() {
        templarios = new TreeSet<>((t1, t2) -> {
            if (t1.getNombre().equals(t2.getNombre())) return 0;
            int cmp = Long.compare(t1.getNivel_peligrosidad(), t2.getNivel_peligrosidad());
            if (cmp == 0) return t1.getNombre().compareTo(t2.getNombre());
            return cmp;
        });
    }

    public boolean insertar(Templario t) {
        return templarios.add(t);
    }

    public boolean eliminar(String nombre) {
        for (Templario t : templarios) {
            if (t.getNombre().equals(nombre)) {
                templarios.remove(t);
                return true;
            }
        }
        return false;
    }

    public void mostrar(boolean asc) {
        System.out.println("TEMPLARIOS ORDENADOS POR ORDEN " +
                (asc ? "ASCENDENTE" : "DESCENDENTE") + " DE PELIGROSIDAD");
        Collection<Templario> lista = asc ? templarios : templarios.descendingSet();
        for (Templario t : lista) {
            System.out.println(t);
        }
    }
}
