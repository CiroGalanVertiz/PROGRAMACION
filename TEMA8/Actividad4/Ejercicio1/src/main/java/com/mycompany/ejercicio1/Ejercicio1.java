/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    private static String DNI;
    private static String nombre;
    private static double importe;
    private static File fichero = new File("donativos.dat");

    public static void main(String[] args) throws IOException {
        //Menu repetitivo
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        fichero.createNewFile();

        do {

            System.out.println("1. anadir donativo");
            System.out.println("2. ver donativos");
            System.out.println("3. Salir");
            System.out.println("introduce una opcion:");
            opcion = teclado.nextInt();
            switch (opcion) {
                //Opcion 1
                case 1 -> {
                    anadirDonativo();
                }
                //Opcion 2
                case 2 -> {
                    listarDonativos();
                }
            }

        } while (opcion != 3);
    }

    private static void anadirDonativo() throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero,true))) {
            Donativo d = new Donativo();
            dos.writeUTF(d.getNombre());
            dos.writeUTF(d.getDNI());
            dos.writeDouble(d.getImporte());
            dos.writeUTF("");
        }

    }

    private static void listarDonativos() throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
            while (dis.available()>0) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readUTF());
                System.out.println(dis.readDouble());
                System.out.println(dis.readUTF());
            }

        }

    }
}
