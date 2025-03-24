/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

import java.util.Arrays;

/**
 *
 * @author DAM120
 */
public class Contenedor<T> {
    
    public T[] array;
    // se inicializa a null contenedor vacío
    public Contenedor(){
        this.array = (T[]) new Object[0];

    }
   
    public void insertarAlPrincipio(T nuevo){
        T[] arrayAux = (T[]) new Object[array.length +1];
        System.out.println("Esto ->"+array.length);
        System.arraycopy(array, 0, arrayAux, 1, array.length);
        arrayAux[0]=nuevo;
        array=arrayAux;
    }
    public void insertarAlFinal(T nuevo){
        System.out.println("Esto ->"+array.length);
        array= Arrays.copyOf(array,array.length+1);
        array[array.length-1]=nuevo;
    }
     public T extraerDelPrincipio(){
         T[] arrayAux = (T[]) new Object[array.length-1];
         T res=array[0];
        array[0]=null;
         System.arraycopy(array, 1, arrayAux, 0, array.length-1);
       array=arrayAux;
        return res;
    }
     public void ordenar(){
       Arrays.sort(array);
     }

    @Override
    public String toString() {
        String cadena = "Contenedor: \n";
        for (int i = 0; i < array.length; i++) {
            cadena+=array[i]+"\n";
            
        }
        return cadena;
        
    }
     
    
}
