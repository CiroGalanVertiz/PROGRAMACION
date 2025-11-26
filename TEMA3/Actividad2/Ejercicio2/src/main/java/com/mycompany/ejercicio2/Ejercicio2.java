/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Empleado juan = new Empleado();
        juan.setAntiguedad(3);
        juan.setNombre("Juan");
        juan.setHoras(100);
        System.out.println("La antiguedad de juan es de: "+juan.getAntiguedad()+" años");
        System.out.println("El nombre de juan es de: "+juan.getNombre());
        System.out.println("Las horas trabajadas de juan son: "+juan.getHoras()+" horas");
        System.out.println("El sueldo de juan es de: "+juan.sueldo()+"€");
        System.out.println("Introduce la antiguedad de pepe");
        int antiguedad = teclado.nextInt();
        System.out.println("Introduce el nombre de pepe");
        String nombre = teclado.next();
        System.out.println("Introduce las horas de pepe");
        int anos = teclado.nextInt();
        Empleado pepe = new Empleado(nombre,antiguedad,anos);
        System.out.println("La antiguedad de pepe es de: "+pepe.getAntiguedad()+" años");
        System.out.println("El nombre de pepe es de: "+pepe.getNombre());
        System.out.println("Las horas trabajadas de pepe son: "+pepe.getHoras()+" horas");
        System.out.println("El sueldo de pepe es de: "+pepe.sueldo()+"€");
        
    }
}
