/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cococ
 */
public class PacienteDAO implements Repositorio<Paciente> {
    
    private Connection getConnection(){
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List<Paciente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Paciente porDNI(String DNI) {
        Paciente paciente = null;
        String sql = "SELECT DNI,nombre,telefono FROM Pacientes where DNI=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql);) {
            stmt.setString(1, DNI);
            try (ResultSet rs = stmt.executeQuery();) {
                if (rs.next()) {
                    paciente = crearPaciente(rs);
                }

            }
        } catch (SQLException ex) {

        }
        return paciente;
    }

    @Override
    public void agregar(Paciente t) {
        String sql="INSERT INTO Pacientes (DNI,nombre,telefono) VALUES (?,?,?)";
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
    public void eliminar(String DNI) {
         String sql="DELETE FROM Pacientes WHERE DNI=?";
        try(PreparedStatement stmt=getConnection().prepareStatement(sql);){
            stmt.setString(1,DNI);
            int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha modificado un solo registro");
            }
            else{
                System.out.println("se ha eliminado correctamente");
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
    public Paciente porId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Paciente crearPaciente(final ResultSet rs) throws SQLException {
        return new Paciente( rs.getString("DNI"),rs.getString("nombre"),rs.getString("telefono"));
    }

   

}
