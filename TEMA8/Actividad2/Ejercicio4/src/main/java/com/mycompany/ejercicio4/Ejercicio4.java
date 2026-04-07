/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int caracter;
        final String rutaEscritorio="D:\\Usuarios\\dam121\\Desktop\\";
        System.out.println("Introduce el nombre del archivo (Se guardara en el escritorio)");
        File fichero1 = new File(rutaEscritorio+ new Scanner(System.in).next());
        File fichero2 = new File(rutaEscritorio+"adios.txt");
        if(!fichero1.exists()){
            fichero1.createNewFile();
        }
        if(!fichero2.exists()){
            fichero2.createNewFile();
        }
        FileInputStream file1 = new FileInputStream(fichero1);
        FileOutputStream file2 = new FileOutputStream(fichero2);
        while((caracter=file1.read())!=-1){
            file2.write((char)caracter);
        }
    }
}
