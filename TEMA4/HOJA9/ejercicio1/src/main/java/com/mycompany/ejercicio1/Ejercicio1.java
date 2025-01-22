/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Array array= new Array();
        array.introducir();
        array.mostrar();
        array.rotarIzquierda();
        array.mostrar();
        array.rotarDerecha();
        array.mostrar();
        Array a=new Array();
        a.introducir();
        array.comparar(a);
        array.sumaPares();
        array.multiplos(3);
       
    }
}
