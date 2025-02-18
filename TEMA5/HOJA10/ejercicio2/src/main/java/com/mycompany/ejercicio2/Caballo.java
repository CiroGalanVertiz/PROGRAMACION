/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import com.mycompany.ejercicio1.Griego;
import com.mycompany.ejercicio1.Guerrero;
import com.mycompany.ejercicio1.Troyano;
import java.util.Arrays;

/**
 *
 * @author DAM120
 */
public class Caballo implements PuedeMontarse{
    private int capacidad;
    private int ocupacion;
    private Guerrero[] ocupantes;

    public Caballo(Guerrero[] ocupantes) {
        boolean troyano=false;
        for (int i=0;i<ocupantes.length && !troyano;i++){
            if(ocupantes[i] instanceof Troyano){
                troyano=true;
            }
            
        }
        if(troyano){
           this.capacidad=100;
           this.ocupantes= new Guerrero[capacidad];
           this.ocupacion=0;
        }
        else{
            this.capacidad=ocupantes.length;
            this.ocupacion=ocupantes.length;
            this.ocupantes=ocupantes;
        }
        
    }

    public Caballo(Guerrero guerrero,int capacidad) {
        this.capacidad = capacidad;
        this.ocupacion=0;
        this.ocupantes = new Guerrero[capacidad];
        if(guerrero instanceof Griego){
            this.ocupacion++;
            this.ocupantes[0]=guerrero;
        } 
    }
    public void ordenar() {  
       Arrays.sort(ocupantes,0,ocupacion);
    }
    
    public int buscar(String nombre){
        ordenar();
        int posicion=-1;
        boolean encontrado=false;
        for (int i = 0; i < this.ocupantes.length && !encontrado; i++) {
            if(nombre.equalsIgnoreCase(ocupantes[i].getNombre())){
               posicion=i;
               encontrado=true;
            }
        }
        return posicion;
    }

    @Override
    public int montar(Guerrero guerrero) {
        int salida=-1;
        if(this.ocupacion<this.capacidad-1) {
        this.ocupantes[ocupacion]=guerrero;
        ocupacion++;
        salida=ocupacion;
    }
        return salida;
        
    }

    @Override
    public void desmontar() {
        for(Guerrero guerrero:this.ocupantes){
            guerrero=null;
        }
    }

      
    
    
    
    
    
    

   
    
}
