/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio7 {
    private static int caracter;

    public static void main(String[] args) throws IOException {
        
        final String rutaEscritorio="D:\\Usuarios\\dam121\\Desktop\\";
        System.out.println("Introduce el nombre del primer archivo (Se guardara en el escritorio)");
        File fichero1 = new File(rutaEscritorio+ new Scanner(System.in).next());
        System.out.println("Introduce el nombre del segundo archivo (Se guardara en el escritorio)");
        File fichero2 = new File(rutaEscritorio+ new Scanner(System.in).next());
        File fichero3 = new File(rutaEscritorio+"final.txt");
        if(!fichero1.exists()){
            fichero1.createNewFile();
        }
        if(!fichero2.exists()){
            fichero2.createNewFile();
        }
        if(!fichero3.exists()){
            fichero3.createNewFile();
        }
        FileInputStream file1 = new FileInputStream(fichero1);
        FileInputStream file2 = new FileInputStream(fichero2);
        FileOutputStream file3 = new FileOutputStream(fichero3);
        escribir(file1,file3);
        file3.write(' ');
        escribir(file2,file3);
        
    }
    private static void escribir(FileInputStream lectura,FileOutputStream escritura) throws IOException{
        while((caracter=lectura.read())!=-1){
            escritura.write((char)caracter);
        }
        
    }
}
