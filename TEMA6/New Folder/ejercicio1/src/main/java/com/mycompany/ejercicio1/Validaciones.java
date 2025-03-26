/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author DAM120
 */
public class Validaciones {
    public static boolean calcularDigitosControl(String entidad,String oficina,String cuenta){
        String cadena="00"+entidad+oficina;
        boolean valido=false;
        int sumatorio=0;
        for(int i=0;i<cadena.toCharArray().length;i++){
            int a= Integer.parseInt(cadena.substring(i,i+1));
            switch(i){
                case 0->sumatorio+=a*1;
                case 1->sumatorio+=a*2;
                case 2->sumatorio+=a*4;
                case 3->sumatorio+=a*8;
                case 4->sumatorio+=a*5;
                case 5->sumatorio+=a*10;
                case 6->sumatorio+=a*9;
                case 7->sumatorio+=a*7;
                case 8->sumatorio+=a*3;
                case 9->sumatorio+=a*6;
            }
            
            
        }
        String numValidacion=String.valueOf(11-sumatorio%11);
        if(numValidacion.equals("10")){
            numValidacion="1";
        }
        if(numValidacion.equals("11")){
            numValidacion="0";
        }
        if(cuenta.substring(0,1).equals(numValidacion) && calcularDigitosControl(cuenta)){
            valido=true;
        }
        return valido;
        
    }
    public static boolean calcularDigitosControl(String cuenta){
        String cadena=cuenta;
        boolean valido=false;
        int sumatorio=0;
        for(int i=0;i<cadena.toCharArray().length;i++){
            int a= Integer.parseInt(cadena.substring(i,i+1));
            switch(i){
                case 0->sumatorio+=a*1;
                case 1->sumatorio+=a*2;
                case 2->sumatorio+=a*4;
                case 3->sumatorio+=a*8;
                case 4->sumatorio+=a*5;
                case 5->sumatorio+=a*10;
                case 6->sumatorio+=a*9;
                case 7->sumatorio+=a*7;
                case 8->sumatorio+=a*3;
                case 9->sumatorio+=a*6;
            }
            
            
        }
        String numValidacion=String.valueOf(11-sumatorio%11);
        if(numValidacion.equals("10")){
            numValidacion="1";
        }
        if(numValidacion.equals("11")){
            numValidacion="0";
        }
        if(cuenta.substring(2,3).equals(numValidacion)){
            valido=true;
        }
        return valido;
       
    }
    public static void validarCuenta(){
        
    }
    public LocalDate pedirFecha(){
        return null;
    }
}
