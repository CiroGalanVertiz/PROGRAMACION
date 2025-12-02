/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM121
 */
public class Usuario {
    private String nombre,apellido,telefono;

    public Usuario(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    public boolean esDeCantabria(){
     return telefono.startsWith("942");
}
   public String generaEmail(){
       return nombre+"_"+apellido+telefono.charAt(telefono.length()-1)+"@javamail.com";
   }
    public int contieneLetra(char letra){
        int contador=0;
        for (Character c: apellido.toCharArray()) {
            if (c.equals(letra)){
                contador++;
            }
        }
        return contador;
    }
}
