/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author cococ
 */
public class Restaurante {
    
    private int huevos;
    private double chorizo;

    public Restaurante(int huevos, double chorizo) {
        this.huevos = huevos;
        this.chorizo = chorizo;
    }

    public int addHuevos(int docenas){
        huevos+=docenas*12;
        return huevos;
    }
    public int addChorizo(int kilos){
        chorizo+=kilos;
        return huevos;
    }
    
    public String getNumPlatos(){
        int platos = huevos/2<(chorizo*1000)/200? huevos/2:(int)(chorizo*1000)/200;
        return "Platos disponibles: "+ platos;
    }
    public void sirvePlato(){
        huevos-= huevos>2 && chorizo*1000>200? 2 : 0;
        chorizo-= huevos>2 && chorizo*1000>200? 0.2 : 0;
        String cadena= huevos>2 && chorizo*1000 >200?"Plato servido":"No hay ingredientes";
        System.out.println(cadena);
    }

    public int getHuevos() {
        return huevos;
    }

    public double getChorizo() {
        return chorizo;
    }
    
    
}
