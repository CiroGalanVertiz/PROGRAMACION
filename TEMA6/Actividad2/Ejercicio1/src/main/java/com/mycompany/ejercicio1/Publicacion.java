/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author DAM121
 */
public class Publicacion {
    protected String titulo;
    protected String autor;
    protected Calendar fecha;

    public Publicacion(String titulo, String autor, int ano,int mes,int dia) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha= Calendar.getInstance();
        this.fecha.set(ano, mes, dia);
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", fecha=" + format(fecha);
    }
    private String format(Calendar fecha){
        return fecha.getTime().getYear()+"/"+fecha.getTime().getMonth()+"/"+fecha.getTime().getDay();
    }
    

}
