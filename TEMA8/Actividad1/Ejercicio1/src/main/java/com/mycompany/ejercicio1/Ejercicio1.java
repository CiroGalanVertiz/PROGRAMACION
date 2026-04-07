/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.io.File;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File file = new File("D:\\Usuarios\\dam121\\Downloads\\Actividad Extra.pdf");
        if(file.exists()){
            System.out.println("archivo encontrado");
        }
        else{
            System.out.println("archivo no encontrado");
        }
    }
}
