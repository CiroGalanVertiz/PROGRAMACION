/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class otroMain {
    public static void main(String[] args) {
        
        DeDos d2 = new DeDos();
        DeTres d3 = new DeTres();
        Series s1=d2;
        Series s2=d3;
        for (int i = 0; i < 5; i++) {
            s1.setComenzar(d2.getSiguiente());
            System.out.println(s1);
        }
        for (int i = 0; i < 5; i++) {
            s2.setComenzar(d3.getSiguiente());
            System.out.println(s2);
        }
    }
    
}
