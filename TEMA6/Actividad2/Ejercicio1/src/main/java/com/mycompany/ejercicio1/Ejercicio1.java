/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Calendar;

/**
 *
 * @author DAM121
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int masPaginas= Integer.MIN_VALUE;
        int masDuracion= Integer.MIN_VALUE;
        Calendar hace30Dias = Calendar.getInstance();
        hace30Dias.add(Calendar.DAY_OF_MONTH, -30);
        Calendar hace2anos = Calendar.getInstance();
        hace30Dias.add(Calendar.YEAR, -2);
        
        Publicacion[] publicaciones= new Publicacion[3];
        
        Publicacion l1= new Libro("agua","hola",2026,1,1,36);
        publicaciones[0]=l1;
        Publicacion l2= new Libro("adios","yo",2025,12,15,1000);
        publicaciones[1]=l2;
        Publicacion d1= new Disco("agua","hola",2023,1,1,36);
        publicaciones[2]=d1;
        for(Publicacion p:publicaciones){
            System.out.println(p);
            if(p instanceof Libro){
                Libro libro= (Libro)p;
                if(libro.getNumPaginas()>masPaginas)
                   masPaginas=libro.getNumPaginas(); 
            }
            if(p instanceof Disco){
                Disco disco= (Disco)p;
                if(disco.getDuracionMinutos()>masDuracion)
                   masDuracion=disco.getDuracionMinutos(); 
            }
        }
        for(Publicacion p:publicaciones){
            if(p instanceof Libro){
                Libro libro= (Libro)p;
                if(libro.getNumPaginas()==masPaginas)
                    System.out.println(libro.getTitulo().substring(0,2));
            }
            if(p instanceof Disco){
                Disco disco= (Disco)p;
                if(disco.getDuracionMinutos()==masDuracion){
                    System.out.println(disco.getTitulo().substring(0,2)); 
                }
                  
            }
        }
        for(Publicacion p:publicaciones){
            if(p instanceof Libro){
                Libro libro= (Libro)p;
                if(libro.getFecha().after(hace30Dias)&& libro.getNumPaginas()>=1000){
                    System.out.println("titulo=" + libro.getTitulo() + ", autor=" + libro.getAutor());
                }
                    
            }
        }
        for(Publicacion p:publicaciones){
            if(p instanceof Disco){
                Disco disco= (Disco)p;
                if(disco.getFecha().after(hace2anos)){
                    System.out.println("titulo=" + disco.getTitulo() + ", autor=" + disco.getAutor());
                }
                    
            }
        }
        
        
    }
}
