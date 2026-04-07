/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.io.File;

/**
 *
 * @author DAM121
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File file = new File("D:\\Usuarios\\dam121\\Downloads\\Actividad Extra.pdf");
        if(file.exists()){
            System.out.println("archivo encontrado");
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getTotalSpace());
        }
        else{
            System.out.println("archivo no encontrado");
        }
    }
}
