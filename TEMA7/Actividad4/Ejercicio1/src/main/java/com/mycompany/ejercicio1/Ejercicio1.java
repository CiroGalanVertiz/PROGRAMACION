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
        Equipo e1 = new Equipo();
        int opcion = 0;
        
        do {
            
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Eliminar Jugador");
            System.out.println("3. Mostrar todos los jugadores");
            System.out.println("4. Mostrar el mas bajo");
            System.out.println("5. Mostrar el mas alto");
            System.out.println("6. Mostrar todos los jugadores que miden mas de 2 metros");
            System.out.println("7. Salir");
            opcion=new Scanner(System.in).nextInt();
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    e1.insetarJugador(new Jugador("Enrique",1));
                }
                //Opcion 2
                case 2 -> {
                    e1.eliminarJugador("enrique");
                }
                //Opcion 3
                case 3 -> {
                    e1.mostrarTodo();
                }
                //Opcion 4
                case 4 -> {
                    e1.devolverBajo();
                }
                //Opcion 4
                case 5 -> {
                    e1.devolverAlto();
                }
                //Opcion 4
                case 6 -> {
                    e1.devolverMasDe2Metros();
                }
                //Opcion por defecto
                default -> {
                    
                }
            }
            
        } while (opcion != 5);
    }
}
