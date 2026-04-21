/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    private static File fichero = new File("factura.dat");
    private static ArrayList<Factura> facturas= new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Menu repetitivo
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {

            System.out.println("1. Anadir factura");
            System.out.println("2. Listado de morosos");
            System.out.println("3. Eliminar fichero");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion:");
            opcion = teclado.nextInt();

            switch (opcion) {
                //Opcion 1
                case 1 -> {
                anadirFactura();
                }
                //Opcion 2
                case 2 -> {
                    listaFacturas();
                }
                //Opcion 3
                case 3 -> {
                    fichero.delete();
                }

                //Opcion por defecto
                default -> {

                }
            }

        } while (opcion != 4);
    }

    public static void anadirFactura() throws IOException {
        try(ObjectOutputStream oos = fichero.length()==0 || fichero.createNewFile()==true? new ObjectOutputStream(new FileOutputStream(fichero,true)): new MiObjectOutputStream(new FileOutputStream(fichero,true));){
            Factura f= new Factura();
            oos.writeObject(f);
        }
            
            
            
        
    }

    public static void listaFacturas() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            while (ois.readObject() != null) {
                Factura f = (Factura) ois.readObject();
                System.out.println(f);
            }

        }
    }
}
