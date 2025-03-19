/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author DAM120
 */
public class Mundo {
    private Set<String> paises;
    
    public Mundo(){
        paises = new LinkedHashSet<>();
    }
    public void añadirPais(String pais){
        if(paises.add(pais)){
            System.out.println("Pais añadido correctamente");
        }
        else{
            System.out.println("no se pudo añadir el pais");
        }
    }
    
    public void borrarPais(String pais){
        String cadena = "No se ha podido borrar el pais";
        Iterator<String> it = paises.iterator();
        boolean encontrado=false;
        while(it.hasNext()&& !encontrado){
            String nomPais = it.next();
            if(pais.equalsIgnoreCase(nomPais)){
                it.remove();
                cadena = "Se ha eliminado el pais";
                encontrado = true;
            }
        }
        System.out.println(cadena); 
        
    }

    @Override
    public String toString() {
        String cadena="MUNDO\npaises:\n";
        for(String s:paises){
            cadena+=s+"\n";
        }
        return cadena;
    }
    
    
    
}
