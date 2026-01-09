/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenud3;

/**
 *
 * @author DAM121
 */
public class Sanitario {
    private String nombre;
    private int edad;
    private int categoria;

    public Sanitario(String nombre, int fNac, int categoria) {
        this.nombre = nombre;
        this.edad = 2025-fNac;
        this.categoria = categoria;
    }
    
    public String getClave(){
        String clave;
        boolean encontrado=false;
        if(this.nombre.indexOf('a')!=-1){
            clave = String.valueOf(this.edad).concat(nombre.substring(0,this.nombre.indexOf('a')+1).toLowerCase().concat(nombre.substring(this.nombre.indexOf('a')+1,nombre.length()).toUpperCase()));
        }
        else{
            clave= String.valueOf(this.edad).concat(this.nombre).toUpperCase();
        }
        return clave;
    }
    
    public String imprimirDatos(){
        String categoria = switch(this.categoria){
            case 1-> "Auxiliar";
            case 2->"Enfermero";
            case 3->"Medico";
            default->"Sin categoria";
        };
        
        return "nombre= " +this.nombre +"\nEdad= "+this.edad+"\nCategoria: "+categoria+ "\nclave= "+this.getClave();
    }
    public double calcularSueldo(int numHijos){
        double sueldo = 1134;
        sueldo = switch(this.categoria){
            case 1-> sueldo*1.15;
            case 2-> sueldo*1.35;
            case 3-> sueldo*1.60;
                default->0;
        };
        return sueldo + 150*numHijos;
    }
    public String conjeturadeUIIman(){
        int aux= this.edad;
        String cadena= String.valueOf(aux);
        while (aux!=1){
            if (aux%2==0){
                aux/=2;
            }
            else{
                aux*=3;
                aux+=1;
            }
            cadena+=" "+aux;
            
            
        }
        return cadena;
    }
}
