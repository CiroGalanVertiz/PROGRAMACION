/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author cococ
 */
public class GestorObras {
    Set<Obra> obras;
    public void agregarObra(Obra obra){
        if(obras.add(obra)){
            System.out.println("Se ha anadido correctamente");
        }
        else{
            System.out.println("no se pudo anadir");
        }
        
    }
    public void eliminarObra(Obra obra){
    Iterator<Obra> it = obras.iterator();
    boolean encontrado = false;
    
    while(it.hasNext() && !encontrado){
        Obra o = it.next();
        
        if(o.equals(obra)){
            it.remove();
            encontrado = true;
        }
    }
    
    if(encontrado){
        System.out.println("Se ha eliminado correctamente");
    }
    else{
        System.out.println("No se pudo eliminar");
    }
}
    public void ratioObras(){
    System.out.println("Obras por mujeres: " + obras.stream().filter(o -> o.getGenero() == Genero.FEMENINO).count()+ "\nObras por hombres: "+obras.stream().filter(o -> o.getGenero() == Genero.MASCULINO).count());
}
}
