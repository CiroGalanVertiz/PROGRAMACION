/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;


import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAM121
 */
public class Equipo{
    SortedSet<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new TreeSet<>();
        this.jugadores.add(new Jugador("Ciro",2));
        this.jugadores.add(new Jugador("Adrian",2));
        this.jugadores.add(new Jugador("Jose",1));
        this.jugadores.add(new Jugador("Alberto",2));
        this.jugadores.add(new Jugador("Gabriel",1));
    }
    
    public void insetarJugador(Jugador jugador){
        if(jugadores.add(jugador)){
            System.out.println("Insertado correctamente");
        }
        else{
            System.out.println("No se ha podido insertar");
        }
        
    }
    public void eliminarJugador(String nombre){
        jugadores.removeIf(p -> p.getNombre().equals(nombre));
    }
    
    public void mostrarTodo(){
        jugadores.forEach(System.out::println);
    }
    public void devolverBajo(){
        System.out.println(this.jugadores.first());
    }
    public void devolverAlto(){
        System.out.println(this.jugadores.last());
    }
    public void devolverMasDe2Metros(){
         SortedSet lista=jugadores.tailSet(new Jugador("C",2));
         lista.forEach(System.out::println);
    }
    
}
