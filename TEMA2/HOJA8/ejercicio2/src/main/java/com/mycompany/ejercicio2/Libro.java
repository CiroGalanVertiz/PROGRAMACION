/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author dam1
 */
public class Libro {
    
    private String ISBN,titulo,autor;

    public Libro(String ISBN, String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public boolean esEspanol(){
        return ISBN.substring(3,5).equals("84");
    }
    
    public String mostrar(){
        return "Titulo: "+titulo.toUpperCase()+"\n Autor: "+autor.substring(0,1).toUpperCase().concat(autor.substring(1,autor.length()).toLowerCase());
    }
    
}
