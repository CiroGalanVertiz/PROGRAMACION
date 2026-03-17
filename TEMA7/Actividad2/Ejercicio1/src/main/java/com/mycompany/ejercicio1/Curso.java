/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author dam121
 */
public class Curso {
    private String codigo;
    private String descripcion;
    private int nHoras;

    public Curso(String codigo, String descripcion,int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }
    

}
