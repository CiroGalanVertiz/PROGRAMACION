/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author cococ
 */
public class Taller {
    
    private int aceite,ruedas,contadorCambiosTotales,contadorCambiosParciales;

    public Taller(int aceite, int ruedas) {
        this.aceite = aceite;
        this.ruedas = ruedas;
    }
    
    public Taller(Taller n){
        this.ruedas=n.ruedas;
        this.aceite=n.aceite;
    }
    
    public void addAceite(int aceite){
        this.aceite+= aceite>0? aceite:0;
        String cadena=aceite>0? "aceite añadido": "No se ha añadido el aceite";
        System.out.println(cadena);
    }
    public void addRuedas(int ruedas){
        this.ruedas+= ruedas>0? ruedas:0;
        String cadena=ruedas>0? "ruedas puestas": "No se han puesto las ruedas";
        System.out.println(cadena);
    }

    public int getCambiosCompletos() {
        int cambios= aceite/3>ruedas/4?ruedas/4:aceite/3;
        return cambios;
    }

    public int getCambiosParciales() {
        int cambios= aceite/3>ruedas/2?ruedas/2:aceite/3;
        return cambios;
    }
    public void cambioCompleto(){
        contadorCambiosTotales+= ruedas>4 && aceite>3? 1:0;
        ruedas -= ruedas>4 && aceite>3? 4:0;
        aceite -= ruedas>4 && aceite>3? 3:0;
        
    }
    public void cambioParcial(){
        contadorCambiosParciales+= ruedas>4 && aceite>3? 1:0;
        ruedas -= ruedas>2 && aceite>3? 2:0;
        aceite -= ruedas>2 && aceite>3? 3:0;
    }

    public int getAceite() {
        return aceite;
    }

    public int getRuedas() {
        return ruedas;
    }
    public String toString(){
        return "TALLER\nEXISTENCIAS:\n\tRuedas: "+ruedas+" unidades.\n\tAceite: "+aceite+" litros.\nINGRESOS: Total: "+(contadorCambiosParciales*135+contadorCambiosTotales*213.5); 
    }
    
    
}
