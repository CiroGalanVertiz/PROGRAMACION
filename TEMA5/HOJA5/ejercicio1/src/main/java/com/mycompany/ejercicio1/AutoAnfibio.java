/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public class AutoAnfibio implements TransporteTerrestre,TransporteMaritimo {
    private String marca,modelo;

    @Override
    public void andar() {
        System.out.println("estoy andando");
    }

    @Override
    public void nadar() {
        System.out.println("estoy nadando");
    }
    
    
    
}
