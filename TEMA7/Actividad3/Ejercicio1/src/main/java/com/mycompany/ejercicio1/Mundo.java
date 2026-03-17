/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author DAM121
 */
public class Mundo {
    
    private Set<Pais> paises;
    
    public Mundo(){
        paises=new HashSet<>();
    }
    public void agregarPais(Pais pais){
         if(paises.add(pais)){
                        System.out.println("pais añadido correctamente");
                    }
                    else{
                        System.out.println("El pais ya existe");
                    }
    }
    public void eliminarPais(Pais pais){
                    boolean encontrado=false;
                    Iterator<Pais> it = paises.iterator();
                    while(it.hasNext() && !encontrado){
                        Pais p1= it.next();
                          if(p1.equals(pais)){
                              it.remove();
                              encontrado=true;
                            }
                    }
        
    }
    public void mostrarPaises(){
        for (Pais p:paises) {
            System.out.println(p);
        }
    }
    
}
