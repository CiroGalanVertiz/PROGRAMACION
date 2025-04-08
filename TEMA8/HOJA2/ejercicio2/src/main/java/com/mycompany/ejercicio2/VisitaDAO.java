/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cococ
 */
public class VisitaDAO implements Repositorio<Visita> {
    
    public Connection getConnection(){
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List<Visita> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Visita porId(int id) {
        return null;
    }

    @Override
    public void agregar(Visita t) {
         String sql="INSERT INTO Visitas (Paciente,fecha,tratamiento,observaciones) VALUES (?,?,?)";
        try(PreparedStatement stmt=getConnection().prepareStatement(sql);){
            String DNI=Teclado.nextLine("Introduce el nuevo usuario"); 
            String nombre=Teclado.nextLine("Introduce la nueva contraseña"); 
            String telefono=Teclado.nextLine("Introduce el nuevo email");
            stmt.setString(1,DNI);
            stmt.setString(2,nombre);
            stmt.setString(3,telefono);
             int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha modificado un solo registro");
            }
            else{
                System.out.println("Se ha insertado correctamente");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Visita porDNI(String DNI) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(String DNI) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
