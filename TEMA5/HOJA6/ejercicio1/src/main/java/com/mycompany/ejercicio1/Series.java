/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.jar.Attributes.Name;

/**
 *
 * @author DAM120
 */
public interface Series {
    int inicio=0;
    
    public int getSiguiente();
    public void reiniciar();
    public void setComenzar(int x);
    default void mostrarInicio(){
        System.out.println(inicio);
    }
    public static void mostrarInterfaz(){
        System.out.println(Name.class);
    }
    
    
}
