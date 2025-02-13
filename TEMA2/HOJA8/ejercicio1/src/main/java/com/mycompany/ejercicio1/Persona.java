/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam1
 */
public class Persona {
    
    private String nombre; 
    private String apellido1; 
    private String apellido2; 
    private String DNI; 
  
    public Persona(String nombre, String apellido1, String apellido2, String DNI) { 
        this.nombre = nombre; 
        this.apellido1 = apellido1; 
        this.apellido2 = apellido2; 
        this.DNI = DNI; 
    } 
    public String clave(){ 
        String contrasena=nombre.substring(0,1)+apellido1.substring(0,3)+apellido2.substring(apellido2.length()-1); 
        return contrasena; 
    } 
    public boolean dniValido(){ 
        String numeros=DNI.substring(0,DNI.length()-1); 
        int numerodni=Integer.parseInt(numeros); 
        int guarda=numerodni%23; 
        String letra=DNI.substring(DNI.length()-1); 
        String texto="TRWAGMYFPDXBNJZSQVHLCKE"; 
        boolean validar=DNI.length()==9&&texto.substring(guarda,guarda+1).equals(letra)?true:false; 
        return validar; 
    } 
}
