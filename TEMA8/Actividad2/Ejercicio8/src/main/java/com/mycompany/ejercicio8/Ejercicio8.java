/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio8 {

    public static void main(String[] args) throws IOException {
        final String rutaEscritorio="D:\\Usuarios\\dam121\\Desktop\\";
        System.out.println("Introduce el nombre del archivo (Se guardara en el escritorio)");
        File fichero = new File(rutaEscritorio+ new Scanner(System.in).next());
        if(!fichero.exists()){
            fichero.createNewFile();
        }
        
        FileInputStream file = new FileInputStream(fichero);
        
    }
    }

