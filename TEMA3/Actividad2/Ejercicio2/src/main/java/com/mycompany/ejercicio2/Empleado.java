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
    //atributos
    private String nombre;
    private int antiguedad;
    private int horas;

    //constructor
    public Empleado(){
        this.nombre="Sin nombre";
    }

    public Empleado(String nombre, int antiguedad, int horas){
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.horas = horas;
    }

    //métodos

    //obtener el sueldo
    public double sueldo(){
        double salario=0;
        if (antiguedad < 10 && antiguedad > 0)
            salario = 10 * horas;
        else if (antiguedad >= 10 && antiguedad < 25)
            salario = 13 * horas;
        else
            salario = 17 * horas;

        return salario;
    }

    //obtener el nombre
    public String getNombre(){
        return nombre;
    }

    //establecer el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //obtener la antiguedad
    public int getAntiguedad(){
        return antiguedad;
    }

    //establecer la antiguedad
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }

    //obtener las horas
    public int getHoras(){
        return horas;
    }

    //establecer las horas
    public void setHoras(int horas){
        this.horas = horas;
    }
}

