/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author DAM120
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();
        leeValores(c1);
        int sumatorio= calcularSuma(c1);
        double media=sumatorio/c1.size();
        mostrarResultados(c1,sumatorio,media);
    }
    public static void leeValores(ArrayList lista){
        
        int a = 0;
        boolean salir=false;
        do {
            a = Teclado.nextInt("Introduce un numero, -99 para parar");
            if (a != -99) {
                lista.add(a);
            }
            else{
                salir=true;
            }
        } while (salir==false);
        
    }
    public static int calcularSuma(ArrayList lista){
        int suma=0;
        for (int i = 0; i < lista.size(); i++) {
            suma += (int) lista.get(i);
        }
        return suma;
    }
    public static void mostrarResultados(ArrayList<Integer> lista,int sumatorio,double media){
        System.out.println("el sumatorio es "+sumatorio+" y la media es: "+media);
        System.out.println("Y los numeros por encima de la media son:");
        for(Integer i: lista){
            if(i>media)
                System.out.println(i);
        }
    }
}
