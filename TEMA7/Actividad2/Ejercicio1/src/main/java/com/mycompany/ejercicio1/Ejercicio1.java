/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam121
 */
public class Ejercicio1 {
        private static String codigo;
        private static String descripcion;
        private static int nHoras;
    public static void main(String[] args) {
        //Menu repetitivo
        
        int opcion = 0;
        Cursos c1 = new Cursos();
        
        do {
            
            System.out.println("1. Aniadir curso el ultimo");
            System.out.println("2. Aniadir curso");
            System.out.println("3. Eliminar curso");
            System.out.println("4. Cambiar hora");
            System.out.println("5. Salir");
            
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    c1.agregarCursoUltimo(crearCurso());
                }
                //Opcion 2
                case 2 -> {
                    c1.agregarCurso(crearCurso());
                }
                //Opcion 3
                case 3 -> {
                    
                }
                //Opcion 4
                case 4 -> {
                    
                }
                //Opcion por defecto
                default -> {
                    
                }
            }
            
        } while (opcion != 5);
    }
    private static Curso crearCurso(){
        Curso curso = null;
        try(Scanner teclado = new Scanner(System.in)){
        System.out.println("Introduce el codigo");
        codigo = teclado.nextLine();
        System.out.println("Introduce la descripcion");
        descripcion = teclado.nextLine();
        System.out.println("Introduce el numero de horas");
        nHoras = teclado.nextInt();
        curso = new Curso(codigo,descripcion,nHoras);
    }
        catch(InputMismatchException e){
            System.out.println("eso no es un numero");
        }
        return curso;
}
}
