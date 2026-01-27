/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author DAM121
 */
public class Letra {
    private String numLetra;
    private String titular;
    private String importe;
    private Calendar fechaVencimiento;

    public Letra(String numLetra, String titular, String importe,int ano,int mes,int dia) {
        this.numLetra = numLetra;
        this.titular = titular;
        this.importe = importe;
        this.fechaVencimiento.set(ano,mes-1,dia);
    }
    
    public boolean vencimiento(){
        return fechaVencimiento.before(Calendar.getInstance());
    }
    
    public void demora(int dias){
        this.fechaVencimiento.add(Calendar.DAY_OF_MONTH, dias);
    }
    
    public int diasFaltan(){
        int dias=0;
        
        if (!vencimiento()){
            long diferencia = this.fechaVencimiento.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
            dias = (int)(diferencia / (1000 * 60 * 60 * 24)) + 1;
        }else{
            System.out.println("fecha pasada");
        }
        return dias;
    }
    
    public void mostrar(){
        System.out.println("numero de letra: "+this.numLetra);
        System.out.println("titular: "+this.titular);
        System.out.println("importe: "+this.importe);
        System.out.println("fecha de vencimiento: "+formatoFecha(this.fechaVencimiento));
    }
    
    private String formatoFecha(Calendar fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // día/mes/año
        return formato.format(fecha.getTime());

    }
   
    
    
}
