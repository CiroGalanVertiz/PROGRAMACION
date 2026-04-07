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
public class GestorEmpleados{
    Set<Empleado> empleados;
    public void agregarEmpleado(Empleado empleado){
    if(empleados.add(empleado)){
        System.out.println("Se ha añadido correctamente");
    }
    else{
        System.out.println("No se pudo añadir");
    }
}
    public void eliminarEmpleado(String numSeguridadSocial){
        boolean encontrado=false;
    Iterator<Empleado> it = empleados.iterator();
    
    while(it.hasNext()&&!encontrado){
        Empleado e = it.next();
        
        if(e.getNumSeguridadSocial().equals(numSeguridadSocial)){
            it.remove();
            System.out.println("Se ha eliminado correctamente");
            encontrado=true;
        }
    }
    
    System.out.println("No se pudo eliminar");
}
    
    public void ratioEmpleado(){
            System.out.println("Empleadas: " + empleados.stream().filter(v -> v.getGenero() == Genero.FEMENINO).count() + "\nEmpleados: " + empleados.stream().filter(v -> v.getGenero() == Genero.MASCULINO).count());

    }
    public void ratioEmpleadoPorTipo(String tipo){
        int contador=0;
        try{
            Class<?> clase = Class.forName(tipo);
        for(Empleado e:this.empleados){
            if(clase.isInstance(e)){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" "+clase.getName()+" entre "+this.empleados.size()+" empleados");
        }
        catch(ClassNotFoundException ex){
            System.out.println("esa clase no existe");
        }
        
        
        
    }
    public void brechaSalarial(){
        double salarioMujeres=0;
        double salarioHombres=0;
        int mujeres=0;
        int hombres=0;
        for(Empleado e:empleados){
            if(e.getGenero()==Genero.MASCULINO){
                salarioHombres+=e.getSueldo();
                hombres++;
            }
            else{
                salarioMujeres+=e.getSueldo();
                mujeres++;
            }
        }
        System.out.printf("%,.02f€ / hombre\n%,.02f€ / mujer",(salarioHombres/hombres),(salarioMujeres/mujeres));
    }
    public void brechaSalarialPorTipo(String tipo){
        double salarioMujeres=0;
        double salarioHombres=0;
        int mujeres=0;
        int hombres=0;
        try{
            Class<?> clase = Class.forName(tipo);
        for(Empleado e:empleados){
            if(clase.isInstance(e)){
            if(e.getGenero()==Genero.MASCULINO){
                salarioHombres+=e.getSueldo();
                hombres++;
            }
            else{
                salarioMujeres+=e.getSueldo();
                mujeres++;
            }
        }
            
            }
       
        
        } catch(ClassNotFoundException ex){
            System.out.println("esa clase no existe");
}
        
        System.out.printf("%,.02f€ / hombre\n%,.02f€ / mujer",(salarioHombres/hombres),(salarioMujeres/mujeres));
    }
}

