/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author DAM121
 */
public  abstract class Forma {
    protected int id;
    
   
    @Override
    public abstract String toString();
    public String identidad(){
        return "mi id es: "+id;
    }
}
