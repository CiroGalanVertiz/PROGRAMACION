/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio5 {

    public static void main(String[] args) throws IOException {
       String rutaEscritorio="D:\\Usuarios\\dam121\\Desktop\\";
        System.out.println("introduce el nombre del archivo()");
       File fichero = new File(rutaEscritorio+new Scanner(System.in).next());
       if(!fichero.exists()){
           fichero.createNewFile();
       }
       try(FileReader fr=new FileReader(fichero);BufferedReader br= new BufferedReader(fr)){
           String linea;
           int palabras = 0;
           while((linea=br.readLine())!=null){
               System.out.println(linea+": "+linea.split(" ").length+" palabras");
            palabras+= linea.isBlank()?linea.split(" ").length:0;
           }
           System.out.println("Palabras: "+palabras);
           
       }
    }
}
