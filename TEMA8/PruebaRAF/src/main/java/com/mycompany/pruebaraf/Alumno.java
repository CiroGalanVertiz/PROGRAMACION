/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaraf;

import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Alumno {
    private int nMatricula;
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private static Scanner teclado = new Scanner(System.in);
    public Alumno(){
        System.out.println("Introduce el numero de matricula:");
        this.nMatricula= teclado.nextInt();
        System.out.println("introduce el nombre:");
        this.nombre = teclado.next();
        if(nombre.length()<40){
          while(nombre.length()<40){
              nombre+="\0";
          }  
        }
        else if(nombre.length()>40){
            nombre.substring(0, 20);
        }
        System.out.println("introduce de la nota 1:");
        this.nota1 = teclado.nextInt();
        System.out.println("introduce de la nota 2:");
        this.nota2 = teclado.nextInt();
        System.out.println("introduce de la nota 3:");
        this.nota3 = teclado.nextInt();
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public static Scanner getTeclado() {
        return teclado;
    }

    public static void setTeclado(Scanner teclado) {
        Alumno.teclado = teclado;
    }
    
}
