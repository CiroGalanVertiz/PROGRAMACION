/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM121
 */
public class Seguridad {
    private FileInputStream lectura;
    private FileOutputStream escritura;
    private File file;
    private static int caracter;
    
    public Seguridad(File file) throws FileNotFoundException{
        this.lectura= new FileInputStream(file);
        this.escritura= new FileOutputStream(file);
        this.file= file;
    }
    public void encriptar() throws IOException{
        File fichero=new File(file.getAbsolutePath());
        while((caracter=lectura.read())!=-1){
        escritura.write((char)caracter+3);
    }
    }
    public void desencriptar() throws IOException{
        while((caracter=lectura.read())!=-1){
        escritura.write((char)caracter-3);
    }
    }
}
