/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int contador=0;
        int caracter=0;
        final String rutaEscritorio="D:\\Usuarios\\dam121\\Desktop\\";
        System.out.println("Introduce el nombre del archivo (Se guardara en el escritorio)");
        File fichero = new File(rutaEscritorio+ new Scanner(System.in).next());
        if(!fichero.exists()){
            fichero.createNewFile();
        }
        
        FileInputStream file = new FileInputStream(fichero);
        while((caracter=file.read())!=-1){
            if(caracter!=' '){
                System.out.print((char)caracter);
                contador++;
            }else{
                System.out.print("\t"+contador);
                System.out.println();
                contador=0;
            }
        }
        System.out.print("\t"+contador);
        
    }
    }

