/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.museo8m;

/**
 *
 * @author cococ
 */


public class Museo8M{
    private static GestorEmpleados ge = new GestorEmpleados();
    private static GestorObras go = new GestorObras();
    private static GestorVisitantes gv = new GestorVisitantes();

    public static void main(String[] args) {
        int opcion=0;

        do {
            mostrarMenu();
            opcion = Teclado.nextInt("Elige una opción: ");

            switch(opcion) {
                case 1 -> gestionEmpleados();
                case 2 -> gestionObras();
                case 3 -> gv.agregarVisitante(new Visitante());
                case 4 -> calculosEstadisticas();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while(opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Gestión de empleados");
        System.out.println("2. Gestión de obras");
        System.out.println("3. Gestión de visitantes");
        System.out.println("4. Cálculos y estadísticas");
        System.out.println("0. Salir");
    }

    // --- Gestión de Empleados ---
    private static void gestionEmpleados() {
        System.out.println("\n--- Gestión de Empleados ---");
        System.out.println("1. Añadir empleado");
        System.out.println("2. Dar de baja empleado");
        int opcion = Teclado.nextInt("Elige opción: ");

        switch(opcion) {
            case 1 -> ge.agregarEmpleado(new Empleado());
            case 2 ->ge.eliminarEmpleado(Teclado.nextLine("Introduce su numero de la seguridad social"));
            default -> System.out.println("Opción no válida.");
        }
    }

    // --- Gestión de Obras ---
    private static void gestionObras() {
        System.out.println("\n--- Gestión de Obras ---");
        System.out.println("1. Añadir obra");
        System.out.println("2. Vender obra");
        int opcion = Teclado.nextInt("Elige opción: ");

        switch(opcion) {
            case 1 -> go.agregarObra(new Obra());
            case 2 -> go.eliminarObra(new Obra());
            default -> System.out.println("Opción no válida.");
        }
    }

    // --- Cálculos y estadísticas ---
    private static void calculosEstadisticas() {
        System.out.println("\n--- Cálculos y Estadísticas ---");
        ge.ratioEmpleado();
        ge.ratioEmpleadoPorTipo(Teclado.nextLine("Introduce el nombre de la clase a filtrar (La primera en mayuscula)"));
        ge.brechaSalarial();
        ge.brechaSalarialPorTipo(Teclado.nextLine("Introduce el nombre de la clase a filtrar (La primera en mayuscula)"));
        go.ratioObras();
        gv.ratioVisitantes();
    }
}



