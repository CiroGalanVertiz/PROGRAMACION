/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM121
 */
public class Cadena {
    private String cadena;
    public Cadena(String cadena){
        this.cadena=cadena;
    }
    public int contarPalabras(){
        int contador = 1;
        if (cadena!=null){
            for (int i = 0; i < this.cadena.length(); i++) {
                if(this.cadena.charAt(i)==' '){
                    contador++;
                }
            }
        }
        else{
            contador=0;
        }
        return contador;
    }
    public int contarMayusculas(){
        int contador = 1;
        if (cadena!=null){
            for (int i = 0; i < this.cadena.length(); i++) {
                if(this.cadena.toUpperCase().charAt(i)==this.cadena.charAt(i)){
                    contador++;
                }
            }
        }
        else{
            contador=0;
        }
        return contador;
    }
    public int contarMinusculas(){
        int contador = 1;
        if (cadena!=null){
            for (int i = 0; i < this.cadena.length(); i++) {
                if(this.cadena.toLowerCase().charAt(i)==this.cadena.charAt(i)){
                    contador++;
                }
            }
        }
        else{
            contador=0;
        }
        return contador;
    }
    public int contarCaracter(char caracter){
        int contador = 1;
        if (cadena!=null){
            for (int i = 0; i < this.cadena.length(); i++) {
                if(this.cadena.charAt(i)==caracter){
                    contador++;
                }
            }
        }
        else{
            contador=0;
        }
        return contador;
    }
    public String eliminarEspacios(){
        return this.cadena.replaceAll(" ","");
    }
    
    public boolean palindroma(){
        String cadena = eliminarEspacios();
        boolean palindroma= true;
        for (int i = 0,j = cadena.length()-1; i < cadena.length()/2 || palindroma==false; i++,j--) {
            if(i!=j){
                palindroma=false;
            }
        }
        return palindroma;
    }
    public String colocarMaatyusculas(char caracter){
        return this.cadena.replaceAll(String.valueOf(caracter),String.valueOf(caracter).toUpperCase());
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
}
