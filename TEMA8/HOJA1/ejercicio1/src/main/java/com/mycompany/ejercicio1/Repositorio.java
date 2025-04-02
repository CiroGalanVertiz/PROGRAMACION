/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.List;

/**
 *
 * @author DAM120
 */
public interface Repositorio<T> {
    public List<T> listar();
    public T porId(int Id);
    public void guardar(T t);
    public void eliminar(int id);
   
    
}
