/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Serie {

    private String nombre;
    private Tematica tematica;
    private String Nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private Map<String, Capitulo> capitulos;

    public Serie() {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Introduce el nombre de la serie:");
            this.nombre = teclado.nextLine();
            System.out.println("Introduce la tematica:");
            this.tematica= Tematica.valueOf(teclado.nextLine().toLowerCase());
            System.out.println("Introduce la nacionalidad:");
            this.nombre = teclado.nextLine();
            System.out.println("Introduce el numero de temporadas:");
            int numTemp = teclado.nextInt();
            if(numTemp<0 || numTemp>15){
                throw new InputMismatchException();
            }
            this.finalizada=false;
        }
        catch (InputMismatchException e){
            System.out.println("Eso no es correcto");
        }
        catch (Exception e){
            System.out.println("Error inesperado");
        }

    }

    public Serie(String nombre, Tematica tematica, String Nacionalidad, int temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.Nacionalidad = Nacionalidad;
        this.temporadas = temporadas;
        this.finalizada=false;
    }

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", tematica=" + tematica + ", Nacionalidad=" + Nacionalidad + ", finalizada=" + finalizada + ", temporadas=" + temporadas + '}';
    }
    public static String generaClaveCapitulo(String nombre,int numTemp,int numCap){
        return nombre.substring(0,4).concat(String.format("%d02",numTemp)).concat(String.format("%d02",numCap));
    }
    public boolean insertarCapitulo(Capitulo capitulo){
        return true;
    }
    

}
