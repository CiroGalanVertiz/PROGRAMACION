/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dam121
 */
public class Cursos {
    private List<Curso> cursos;
    
    public Cursos(){
        this.cursos = new LinkedList<>();
    }
    
    public void agregarCursoUltimo(Curso c){
        cursos.addLast(c);
    }
    public void agregarCurso(Curso c){
        String texto = cursos.add(c)? "Se ha insertado correctamente":"No se ha podido insertar";
        System.out.println(texto);
    }
    public void eliminarCurso(String codigo){
        Iterator<Curso> it = cursos.iterator();
        boolean encontrado=false;
        while(it.hasNext() && !encontrado){
            Curso curso = it.next();
            
            if(curso.getCodigo().equalsIgnoreCase(codigo)){
                it.remove();
            }
            
        }
    }
    public void modificarHoras(String codigo,int nHoras){
        Iterator<Curso> it = cursos.iterator();
        boolean encontrado=false;
        while(it.hasNext() && !encontrado){
            Curso curso = it.next();
            
            if(curso.getCodigo().equalsIgnoreCase(codigo)){
                curso.setnHoras(nHoras);
            }
            
        }
    }
    
}
