/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio2 {

    private static String DNI;
    private static String nombre;
    private static double importe;
    private static File fichero1 = new File("alumnos.dat");
    private static File fichero2 = new File("promocionan.dat");
    private static List<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        //Menu repetitivo
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        fichero1.createNewFile();
        fichero2.createNewFile();

        do {

            System.out.println("1. anadir alumnos");
            System.out.println("2. listar aprobados");
            System.out.println("3. Salir");
            System.out.println("introduce una opcion:");
            opcion = teclado.nextInt();
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    anadirAlumno();
                }
                //Opcion 2
                case 2 -> {
                    listarPromocionados();
                }
            }

        } while (opcion != 3);
    }

    private static void anadirAlumno() throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero1, true))) {
            Alumno a = new Alumno();
            alumnos.add(a);
            dos.writeInt(a.getnMatricula());
            dos.writeUTF(a.getNombre());
            dos.writeInt(a.getNota1());
            dos.writeInt(a.getNota2());
            dos.writeInt(a.getNota3());
            dos.writeUTF("");
        }

    }

    private static void listarPromocionados() throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero2, true))) {
            
            for (Alumno a : alumnos) {
                if (a.getNota1()>5 && a.getNota2()>5 && a.getNota3()>5) {
                    dos.writeInt(a.getnMatricula());
                    dos.writeUTF(a.getNombre());
                    dos.writeInt(a.getNota1());
                    dos.writeInt(a.getNota2());
                    dos.writeInt(a.getNota3());
                    dos.writeUTF("");
                }
            }
        }

    }
}
