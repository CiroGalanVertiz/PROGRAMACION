/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import com.mycompany.ejercicio6.Contenedor;
/**
 *
 * @author DAM120
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Contenedor<Integer> c1= new Contenedor<>();
       c1.insertarAlPrincipio(1);
       c1.insertarAlPrincipio(2);
       c1.insertarAlPrincipio(7);
       System.out.println(c1.toString());
       c1.ordenar();
       System.out.println(c1.toString());
       System.out.println(c1.extraerDelPrincipio());
    }
}
