package com.mycompany.ejercicio2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam120
 */
public class Curso {
    private String nomCurso;
    private String[] nomAlumnos;

    public Curso(String nomCurso,int numAlumnos) {
        this.nomCurso = nomCurso;
        this.nomAlumnos= new String[numAlumnos];
        for (int i = 0; i < this.nomAlumnos.length; i++) {
            System.out.println("Alumno "+(i+1)+":");
            this.nomAlumnos[i]= new Scanner(System.in).nextLine();
        }
    }
    public String iniciales(){
        String cadena="";
        for (int i = 0; i < this.nomAlumnos.length; i++) {
            cadena+= i==this.nomAlumnos.length-1?this.nomAlumnos[i].substring(0,1).toUpperCase()+"\n":this.nomAlumnos[i].substring(0,1).toUpperCase();
        }
        return cadena;        
    }
    public void desplaza(){
        String aux="";
        for (int i = this.nomAlumnos.length-1;i>=0; i--) {
            
                aux=this.nomAlumnos[i-1];
                this.nomAlumnos[i-1]=this.nomAlumnos[i];
           
        }
    }
    public String verNombre(int alumno){
        return "Alumno: "+alumno+": "+this.nomAlumnos[alumno+1];  
    }
    public boolean esDaw(){
        return this.nomCurso.toLowerCase().contains("daw");
    }
     
}
