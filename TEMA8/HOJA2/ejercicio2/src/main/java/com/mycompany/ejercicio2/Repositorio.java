/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.List;

/**
 *
 * @author cococ
 */
public interface Repositorio<T> {
    
    public List<T> listar();
    public T porId (int id);
    public T porDNI (String DNI);
    public void agregar (T t);
    public void eliminar(String DNI);
    public void eliminar(int Id);
    
}
