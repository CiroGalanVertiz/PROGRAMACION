/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author DAM120
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Almacen a1 = new Almacen();
        a1.añadirArticulo(new Articulo());
        a1.añadirArticulo(new Articulo());
        a1.añadirArticulo(new Articulo());
        a1.añadirArticulo(new Articulo());
        a1.buscar(Teclado.next("Introduce el codigo del articulo que quieres buscar:"));
        a1.buscar(Teclado.next("Introduce el codigo del articulo que quieres buscar:"));
        a1.pedidos();
    }
}
