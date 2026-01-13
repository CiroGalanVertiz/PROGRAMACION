/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM121
 */
public class Avion {
    private boolean[][] asientos;
    
    public Avion(){
        asientos = new boolean[24][4];
    }
    public void reserva(int x,int y){
        String msj="El sitio ya esta ocupado";
        if (asientos[x][y]==false) {
            msj="asiento reservado";
            asientos[x][y]=true;
        }
        System.out.println(msj);
    }
    
}
