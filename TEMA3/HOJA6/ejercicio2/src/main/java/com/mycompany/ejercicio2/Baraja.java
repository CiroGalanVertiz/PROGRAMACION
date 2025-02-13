/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author dam1
 */
public class Baraja {

    private int num;
    private int tipo;

    public Baraja() {
        this.num = (int) (Math.floor(Math.random() * (10 - 1 + 1) + 1));
        this.tipo = (int) (Math.floor(Math.random() * (4 - 1 + 1) + 1));
    }

    public String mostrar() {
        String cadena = switch (tipo) {
            case 1 ->
                "Oros";
            case 2 ->
                "Copas";
            case 3 ->
                "Espadas";
            case 4 ->
                "Vastos";
            default ->
                "No esta en el rango";

        };
        return num + " de " + cadena;
    }

    public int getNum() {
        return num;
    }
}
