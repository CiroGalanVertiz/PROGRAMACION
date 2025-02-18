/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import com.mycompany.ejercicio1.Griego;
import com.mycompany.ejercicio1.Troyano;

/**
 *
 * @author DAM120
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Troyano t1= new Troyano("Ciro",23,2);
        Griego g1= new Griego("Saul",25,2);
        Caballo c1= new Caballo(g1,100);
        if(c1.montar(t1)==-1){
            System.out.println("NO PUEDE MONTAR");
        }
        Troyano t2= new Troyano();
        Griego g2= new Griego();
        
    }
}
