/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

/**
 *
 * @author cococ
 */
public class Escultura extends Obra{
    private String material;
    public Escultura() {
    super();
    material = Teclado.nextLine("Material: ");
}
}
