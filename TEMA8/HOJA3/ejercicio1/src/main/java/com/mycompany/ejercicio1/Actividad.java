/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author cococ
 */
public class Actividad {
    private  int id;
    private  String nombre;
    private  int plazasLibres;
    private  String dia;
    private  String hora;

    public Actividad(int id, String nombre, int plazasLibres, String dia, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.plazasLibres = plazasLibres;
        this.dia = dia;
        this.hora = hora;
    }

    public Actividad(String nombre, int plazasLibres, String dia, String hora) {
        this.nombre = nombre;
        this.plazasLibres = plazasLibres;
        this.dia = dia;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public String toString() {
        return id +" - "+ nombre  + ", el dia " + dia +" de "+ hora+ ", plazasLibres=" + plazasLibres;
    }
    
    
}
