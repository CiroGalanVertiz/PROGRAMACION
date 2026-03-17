/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dam121
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        List<Persona> agenda = new ArrayList<>();
        if(agenda.add(new Persona("ciro","hola","si"))){
            System.out.println("se ha insertado correctamente");
        }
        if(agenda.add(new Persona("hola","adios","no"))){
            System.out.println("se ha insertado correctamente");
        }
        if(agenda.remove(new Persona("hola","adios","no"))){
            System.out.println("se ha insertado correctamente");
        }
        Iterator<Persona> it = agenda.iterator();
        while(it.hasNext()){
            Persona persona= it.next();
            System.out.println(persona.toString());
        }
        if(agenda.add(new Persona("hola","adios","no"))){
            System.out.println("se ha insertado correctamente");
        }
        Iterator<Persona> it2 = agenda.iterator();
        boolean encontrado=false;
        while(it2.hasNext() && !encontrado){
            Persona persona=it2.next();
            if(persona.getDNI().equals("no")){
                System.out.println("Persona encontrada");
                System.out.println(persona.toString());
                encontrado=true;
            }
        }
        
    }
}
