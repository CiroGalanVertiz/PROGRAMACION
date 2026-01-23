/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author DAM121
 */
public class Empleado {
    protected String nombre;
    protected String departamento;
    protected int edad;
    protected boolean casado;
    protected double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String departamento, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    public String clasificacion(){
        String clasificacion="";
        if(this.edad>35){
            clasificacion="Senior";
        }
        if(this.edad>=22 && this.edad<=35){clasificacion="Intermedio";
        }
        if(this.edad<=21){clasificacion="Principiante";
        }
        return clasificacion;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", departamento=" + departamento + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    public void aumentarSalario(int porcentaje){
        this.salario*=1+(double) porcentaje/100;
    }
}
