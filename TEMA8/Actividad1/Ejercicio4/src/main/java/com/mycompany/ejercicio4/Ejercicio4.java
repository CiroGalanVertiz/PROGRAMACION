/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Introduce el nombre de una ruta");
        File file = new File(new Scanner(System.in).next());
        if(file.exists() && file.isDirectory()){
            Ejercicio4.mostrarDirectorio(file);
        }
    }
    private static void mostrarDirectorio(File file){
        
        for(File f: file.listFiles()){
            System.out.println(f.getName());
            if(f.isDirectory() && f.listFiles()!=null){
                Ejercicio4.mostrarDirectorio(f);
            }
                
            
    }
}
}
