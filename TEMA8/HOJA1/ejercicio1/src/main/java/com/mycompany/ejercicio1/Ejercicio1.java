/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author DAM120
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int id=0;
        try(Connection conn= AccesoBaseDatos.getInstance().getConn();){
            Repositorio<Usuario> repositorio = new UsuarioDAOImp();
             System.out.println("Gestion de usuarios:");
        int opcion=0;
        do{
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Agregar");
            System.out.println("4. Listar");
            System.out.println("5. salir");
            
            opcion=new Scanner(System.in).nextInt();
            
            switch (opcion){
                case 1->{
                        Usuario usuario=null;
                  id= Teclado.nextInt("Introduce la Id del usuario que quieras modificar");
                  usuario=repositorio.porId(id);
                  if(usuario!=null){
                      usuario.toString();
                      repositorio.actualizar(id);
                  }
                  else{
                      System.out.println("no se ha encontrado el usuario");
                  }
                }
                case 2->{
                     id= Teclado.nextInt("Introduce la Id del usuario que quieras eliminar");
                  if(repositorio.porId(id)!=null){
                      repositorio.eliminar(id);
                  }
                  else{
                      System.out.println("no se ha encontrado el usuario");
                  }
                }
                case 3->{
                    repositorio.agregar();
                }
                case 4->{
                    
                }
                default->{
                    System.out.println("numero incorrecto");
                }
            }
        }while(opcion!=5);
        } catch (SQLException ex) {
           
        }
       
    }
}
