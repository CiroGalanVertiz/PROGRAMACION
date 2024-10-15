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
        String nombre="Pepito";
        String primerApellido="Perez";
        String segundoApellido="Fernandez";
        System.out.println("Nombre completo: "+nombre.concat(" "+primerApellido).concat(" "+segundoApellido)+
               "\nSu longitud: "+(nombre.length()+primerApellido.length()+segundoApellido.length()));
    }
}
