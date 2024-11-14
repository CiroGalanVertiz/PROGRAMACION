/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author dam1
 */
public class FormatoFecha {
    private int dia;
    private String diaSemana;
    private String diaMes;
    private int ano;

    public FormatoFecha(int dia, int diaSemana, int diaMes, int ano) {
        this.dia = dia;
        this.diaSemana = this.obtenerDiaSemana(diaSemana);
        this.diaMes = this.obtenerDiaMes(diaMes);
        this.ano = ano;
    }
    private String obtenerDiaSemana(int diaSemana){
       
        
        String cadena = switch (diaSemana) {
            case 1 ->
                "Lunes";
            case 2 ->
                "Martes";
            case 3 ->
                "Miercoles";
            case 4 ->
                "Jueves";
            case 5 ->
                "Viernes";
            case 6 ->
                "Sabado";
            case 7 ->
                "Domingo";
            default ->
                "nofecha";
        };
        return cadena;
    }
    
    private String obtenerDiaMes(int diaMes){
       
        
        String cadena = switch (diaMes) {
            case 1 ->
                "Enero";
            case 2 ->
                "Febrero";
            case 3 ->
                "Marzo";
            case 4 ->
                "Abril";
            case 5 ->
                "Mayo";
            case 6 ->
                "Junio";
            case 7 ->
                "Julio";
            case 8 ->
                "Agosto";
            case 9 ->
                "Septiembre";
            case 10 ->
                "Octubre";
            case 11 ->
                "Noviembre";
            case 12 ->
                "Diciembre";
            default ->
                "nofecha";
        };
         return cadena;       
    }
    public void salidaFormatoFecha(){
        System.out.println(diaSemana+", "+dia+" de "+diaMes+" de "+ano);
    }
    
}
