/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

/**
 *
 * @author cococ
 */
public class Pintura extends Obra{
 private String tipoPintura;
 
 public Pintura() {
    super();
    tipoPintura = Teclado.nextLine("Tipo de pintura: ");
}
}
