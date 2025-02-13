/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Alarma {
    
    private double grados;
    private Timbre timbre;

    public Alarma(double grados) {
        this.grados = grados;
        this.timbre = timbre.apagado;
        
    }
    
    public void comprueba(){
        timbre = this.grados>35 || this.grados<10? timbre.encendido:timbre.apagado;
      
    }
  public void normaliza (){
      
     
      this.grados = 25;
      this.timbre =timbre.apagado;
   
  }

  

    public Timbre getTimbre() {
        return timbre;
    }
  
    
}
