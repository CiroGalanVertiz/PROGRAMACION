/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author DAM120
 */
public class Almacen {
    
    private Set<Articulo> articulos;
    
    public Almacen(){
        articulos= new LinkedHashSet<>();
    }
    public void añadirArticulo(Articulo articulo){
        if(this.articulos.add(articulo)){
            System.out.println("añadido correctamente");
        }
        else{
            System.out.println("no se ha podido añadir el articulo");
        }
    }
    public Articulo buscar(String codigo){
        Iterator<Articulo> it = this.articulos.iterator();
        Articulo articulo=null;
        boolean encontrado=false;
        while(it.hasNext()&& !encontrado){
            Articulo aux = it.next();
            if(aux.getCodigo().equalsIgnoreCase(codigo)){
               articulo= aux;
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println(articulo);
        }
        else{
            System.out.println("no se ha encontrado el objeto");
        }
        return articulo;
    }
    public void pedidos(){
         Iterator<Articulo> it = this.articulos.iterator();
        Articulo articulo=null;
        System.out.println("PEDIDOS");
        while(it.hasNext()){
            articulo=it.next();
            if (articulo.getExistencias()<5){
                System.out.println(articulo);
            }
            
        }
        
    }
    
}
