/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author cococ
 */
public class Coche {
    
    private String matricula;
    private int velocidad;

    public Coche() {
    }

    public Coche(String matricula, int velocidad) {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }
    
    public void acelera(int vel){
        velocidad = vel>velocidad && vel<120? vel:velocidad;
        String cadena = vel>velocidad? "la velocidad se ha cambiado a "+vel:"no se ha cambiado la velocidad porque el numero introducido es menor o superior a 120";
        System.out.println(cadena);
    }    
    public void frena(int vel){
        velocidad = vel<velocidad && vel>0? vel:velocidad;
        String cadena = vel<velocidad? "la velocidad se ha cambiado a "+vel:"no se ha cambiado la velocidad porque el numero introducido es mayor o inferior a 0";
        System.out.println(cadena);
    }
    public String letrasMatricula(){
        return this.matricula.substring(4,matricula.length());
    }
    public String printCoche() {
        return "La matricula del coche es: "+matricula+"\nLa velocidad del coche es: "+velocidad;
    }
    
    
}    

