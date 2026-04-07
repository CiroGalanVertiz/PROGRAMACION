/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cococ
 */
public class Visitante {
    private String edad;
    private Genero genero;
    private String provincia;
    
    public Visitante() {
    this.edad = Teclado.nextLine("Edad: ");
    this.genero = Teclado.nextEnum("Género(MASCULINO/FEMENINO): ",Arrays.asList(Genero.values()));
    this.provincia = Teclado.nextLine("Provincia: ");
}

    public Genero getGenero() {
        return genero;
    }
    
    
}
