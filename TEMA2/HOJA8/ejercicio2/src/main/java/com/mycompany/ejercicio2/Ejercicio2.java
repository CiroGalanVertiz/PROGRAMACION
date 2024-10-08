/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author dam1
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Libro l1 = new Libro("9788420676159", "La celestina", "Fernando de Rojas");
        System.out.println(l1.mostrar());
        System.out.println("¿Es español " + l1.getTitulo() + "? :" + l1.esEspanol());
    }
}
