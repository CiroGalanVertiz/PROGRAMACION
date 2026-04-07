/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DAM121
 */
public class Ejercicio3 {

    public static void main(String[] args) throws IOException{
        File file= new File("D:\\Usuarios\\dam121\\Desktop\\hola.txt");
        if(file.exists()){
            file.delete();
        }
            System.out.println("Archivo no encontrado");
            System.out.println("Creando archivo...");
            file.createNewFile();
            System.out.println("Archivo creado");
        
        if(file.exists()){
            System.out.println("archivo encontrado");
        }
        
    }
}
