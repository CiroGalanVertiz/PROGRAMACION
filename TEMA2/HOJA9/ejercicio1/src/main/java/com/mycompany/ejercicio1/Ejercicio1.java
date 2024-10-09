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
       Alarma a1 = new Alarma(45);
        a1.comprueba();
        if(a1.getTimbre()==Timbre.encendido){
            a1.normaliza();
            System.out.println("Regulando temperatura");
        }
       
    }
}
