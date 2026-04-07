/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadextra;

/**
 *
 * @author DAM121
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadExtra {
    public static void main(String[] args) {
        Bestiario bestiario = new Bestiario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n╔══════════════════════════════════╗");
            System.out.println("║     GESTOR DE BESTIARIO          ║");
            System.out.println("║        FINAL FANTASY             ║");
            System.out.println("╚══════════════════════════════════╝");
            System.out.println("1. Crear criatura y añadirla al bestiario");
            System.out.println("2. Mostrar bestiario");
            System.out.println("3. Eliminar criatura del bestiario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer
            } catch (InputMismatchException e) {
                opcion = 0;
                sc.nextLine();
            }

            switch (opcion) {
                case 1:
                    crearYAgregarCriatura(bestiario, sc);
                    break;
                case 2:
                    bestiario.mostrarCriaturas();
                    break;
                case 3:
                    eliminarCriatura(bestiario, sc);
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el Bestiario de Final Fantasy!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }

    private static void crearYAgregarCriatura(Bestiario bestiario, Scanner sc) {
        try {
            System.out.print("Nombre de la criatura (3-25 caracteres): ");
            String nombre = sc.nextLine().trim();

            System.out.println("Tipo de criatura:");
            TipoCriatura[] tipos = TipoCriatura.values();
            for (int i = 0; i < tipos.length; i++) {
                System.out.println((i + 1) + ". " + tipos[i]);
            }
            System.out.print("Elige número: ");
            int idx = sc.nextInt() - 1;
            sc.nextLine();
            if (idx < 0 || idx >= tipos.length) {
                System.out.println("Tipo inválido.");
                return;
            }
            TipoCriatura tipo = tipos[idx];

            System.out.print("Nivel (1-99): ");
            int nivel = sc.nextInt();
            sc.nextLine();

            Criatura c = new Criatura(nombre, tipo, nivel);
            bestiario.agregarCriatura(c);
        } catch (Exception e) {
            System.out.println("Error al crear la criatura: " + e.getMessage());
        }
    }

    private static void eliminarCriatura(Bestiario bestiario, Scanner sc) {
        try {
            System.out.print("Nombre de la criatura a eliminar: ");
            String nombre = sc.nextLine().trim();
            System.out.print("Nivel: ");
            int nivel = sc.nextInt();
            sc.nextLine();
            bestiario.eliminarCriatura(nombre, nivel);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
