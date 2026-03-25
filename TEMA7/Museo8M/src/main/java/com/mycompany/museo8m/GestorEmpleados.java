/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.util.Set;

/**
 *
 * @author cococ
 */
public class GestorEmpleados{
    Set<Empleado> empleados;
    public void ratioEmpleado(){
        int contador=0;
        for(Empleado e:this.empleados){
            if(e.getGenero()==Genero.FEMENINO){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" mujeres entre "+this.empleados.size()+" empleados");
    }
    public void ratioEmpleadoPorTipo(Class tipo){
        int contador=0;
        
        for(Empleado e:this.empleados){
            if(tipo.isInstance(e)){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" "+tipo.getName()+" entre "+this.empleados.size()+" empleados");
    }
}
