/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.Arrays;

/**
 *
 * @author DAM121
 */
public class Plantilla {
    private Empleado[] empleados;
    private int contador;

    public Plantilla() {
        this.empleados= new Empleado[0];
        this.contador= 0;
    }
    public void insertar(Empleado empleado){
                this.contador+=1;
                this.empleados=Arrays.copyOf(empleados,this.contador);
                this.empleados[this.empleados.length-1]=empleado;
                System.out.println("insertado correctamente");
            
            
        
    }
    @Override
    public String toString(){
        String salida="";
        for (Empleado e:this.empleados) {
            salida+=e;
        }
        return salida;
    }
    public Programador  masLineas(){
        Programador masLineas=null;
        int maxLineas=Integer.MIN_VALUE;
        for (Empleado e:this.empleados) {
            for (int i = 0; i < this.empleados.length; i++) {
                if(e instanceof Programador){
                Programador programador = (Programador) e;
                if(programador.getLineasdeCodigoPorHora()>maxLineas){
                    masLineas=programador;
                    maxLineas=masLineas.getLineasdeCodigoPorHora();
                }
            }
            }
            
        }
        return masLineas;
    }
    
    public String infoSenior(){
        
        String salida="";
        for (Empleado e:this.empleados) {
            if(e.clasificacion().equals("Senior"))
            salida+=e;
        }
        return salida;
    }
    
    public void aumentarJava(){
        for (Empleado e:this.empleados) {
            for (int i = 0; i < this.empleados.length; i++) {
                if(e instanceof Programador){
                Programador programador = (Programador) e;
                if(programador.getLenguajeDominante().equals("java")){
                    programador.aumentarSalario(20);
                }
            }
            }
            
        }
    }
    
    
}
