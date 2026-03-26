/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.museo8m;

import java.util.List;

/**
 *
 * @author cococ
 */
public class GestorVisitantes {
    List<Visitante> visitantes;
    public void agregarVisitante(Visitante visitante){
    if(visitantes.add(visitante)){
        System.out.println("Se ha añadido correctamente");
    }
    else{
        System.out.println("No se pudo añadir");
    }
}

public void ratioVisitantes() {
    System.out.println("Visitantes mujeres: " + visitantes.stream().filter(v -> v.getGenero() == Genero.FEMENINO).count() + " | Visitantes hombres: " + visitantes.stream().filter(v -> v.getGenero() == Genero.MASCULINO).count());
}

}
