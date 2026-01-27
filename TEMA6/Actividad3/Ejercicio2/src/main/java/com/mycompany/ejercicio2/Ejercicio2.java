/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
public class Ejercicio2{
    public static void main(String[] args) {

        int[] notasAlumno = {7, 8, 9};
        Alumno alumno = new Alumno(
                "12345678A",
                "Carlos Pérez",
                "Calle Mayor 10",
                notasAlumno
        );

        String[] asignaturasProfesor = {"programación", "bases de datos"};
        Profesor profesor = new Profesor(
                "87654321B",
                "Ana Gómez",
                "Avenida Central 5",
                asignaturasProfesor
        );

        System.out.println("=== ALUMNO ===");
        alumno.mostrar();

        System.out.println("\n=== PROFESOR ===");
        profesor.mostrar();
    }
}

