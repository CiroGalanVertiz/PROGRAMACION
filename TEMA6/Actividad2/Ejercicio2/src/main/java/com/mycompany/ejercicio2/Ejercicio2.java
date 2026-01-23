/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author DAM121
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Plantilla p1= new Plantilla();
        Programador prog1= new Programador();
        Programador prog2= new Programador("Ciro","desarrollador",47,false,1200,30,"java");
        p1.insertar(prog2);
        System.out.println(prog2.clasificacion());
        p1.aumentarJava();
        System.out.println(p1.infoSenior());
        System.out.println(p1.masLineas());
        
    }
}
