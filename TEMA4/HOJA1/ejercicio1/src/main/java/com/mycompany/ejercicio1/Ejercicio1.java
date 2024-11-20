/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] array = new int[]{-2, -2, -2, -2, -2, -2, -2, -2, -2, -2};
        System.out.println("Array todo a -1:");
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
            System.out.println(array[i]);

        }
        System.out.println();
        System.out.println("Array con Math.random:");
        for (int i = 0; i < 10; i++) {
            array[i] = (int) Math.floor(Math.random() * 12);
            System.out.println(array[i]);
        }
    }
}
