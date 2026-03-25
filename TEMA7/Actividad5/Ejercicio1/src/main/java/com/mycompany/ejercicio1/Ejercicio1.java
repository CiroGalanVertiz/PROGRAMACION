/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        GestorSeries g1 = new GestorSeries();
        int opcion = 0;

        do {

            opcion = Teclado.nextInt("""
                                     1. Anadir serie
                                     2. Eliminar serie
                                     3. Ver series almacenadas
                                     4. Anadir capitulo
                                     5. Eliminar capitulo
                                     6. Ver capitulos
                                     7. Salir""");
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    g1.anadirSerie();
                }
                //Opcion 2
                case 2 -> {
                    g1.eliminarSerie();
                }
                //Opcion 3
                case 3 -> {
                    g1.verSeries();
                }
                //Opcion 4
                case 4 -> {
                    g1.anadirCapitulo();
                }
                case 5 -> {
                    g1.eliminarCapitulo();
                }
                case 6 -> {
                    g1.verCpaitulos();
                }
                //Opcion por defecto
                default -> {

                }
            }

        } while (opcion != 7);
    }
}
