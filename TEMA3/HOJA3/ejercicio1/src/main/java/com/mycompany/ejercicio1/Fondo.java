/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Fondo {
    private double c;
    private double i;
    private int n;

    public Fondo(double c, double i, int n) {
        this.c = c;
        this.i = i;
        this.n = n;
    }
    public void evolucion(){
        int ano=1;
        while(ano<=n){
            System.out.printf("%s%d%s%,.2f€\n","Ano ",ano,": ",(c+(c*i/100*ano)));
            ano++;
        }
    }
}
