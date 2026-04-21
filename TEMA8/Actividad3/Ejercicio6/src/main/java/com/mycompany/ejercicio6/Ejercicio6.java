/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM121
 */
public class Ejercicio6 {
 private static ArrayList<String> socios= new ArrayList<>();
    public static void main(String[] args) {
        
        //Menu repetitivo
        
        int opcion = 0;
        
        do {
            
            System.out.println("1. Añadir un nombre");
            System.out.println("2. Borrar un nombre");
            System.out.println("3. Leer fichero");
            System.out.println("4. Salir");
            System.out.println("Introduce una opcion: ");
            opcion= new Scanner(System.in).nextInt();
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    llenarArray();
                    System.out.println("Introduce el nombre a añadir: ");
                    String nombre=new Scanner(System.in).nextLine();
                    socios.add(nombre);
                    escribirFichero();
                            
                }
                //Opcion 2
                case 2 -> {
                    borrarSocio();
                    escribirFichero();
                }
                //Opcion 3
                case 3 -> {
                    leerFichero();
                }
                //Opcion por defecto
                default -> {
                    
                }
            }
            
        } while (opcion != 5);
    }

    private static void borrarSocio() {
        System.out.println("introduce el nombre a borrar");
        String nombre=new Scanner(System.in).nextLine();
        Iterator it= socios.iterator();
        while(it.hasNext()){
            if(it.equals(nombre)){
                it.remove();
            }
        }
    }
    


    private static void leerFichero() {
        llenarArray();
        for(String s: socios){
            System.out.println(s);
        }
    }

    private static void llenarArray() {
        try(FileReader fr = new FileReader(new File("socios.txt"));BufferedReader br=new BufferedReader(fr)){
            socios.clear();
            String linea="";
            while((linea=br.readLine())!=null){
               socios.add(linea);
            }
            
        }catch (IOException ex) {
        }
    }
    private static void escribirFichero(){
        try( BufferedWriter bw=new BufferedWriter(new FileWriter(new File("socios.txt"),false))){
            llenarArray();
            for(String s: socios){
                bw.write(s);
        }
        } catch (IOException ex) {
            System.out.println("ha ocurrido un eror");
     }
    }
}
