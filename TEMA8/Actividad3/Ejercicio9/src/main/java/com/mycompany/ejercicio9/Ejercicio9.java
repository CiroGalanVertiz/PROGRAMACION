/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio9 {

    public static void main(String[] args) throws IOException {
        String rutaEscritorio="D:\\Usuarios\\dam121\\Desktop\\";
        System.out.println("introduce el nombre del archivo()");
        LinkedList<String> cancion=new LinkedList<>();
       File fichero = new File(rutaEscritorio+new Scanner(System.in).next());
       if(!fichero.exists()){
           fichero.createNewFile();
       }
       try(FileReader fr=new FileReader(fichero);BufferedReader br= new BufferedReader(fr)){
           String linea;
           String estrofa=null;
           while((linea=br.readLine())!=null){
               if(!linea.isBlank()){
                   estrofa+=linea+"\n";
               }else{
                   cancion.add(estrofa);
                   estrofa="";
               }
       }
           cancion.add(estrofa);
           Iterator it=cancion.descendingIterator();
           while(it.hasNext()){
               System.out.println(it.next());
           }
           
    }
    }
}
