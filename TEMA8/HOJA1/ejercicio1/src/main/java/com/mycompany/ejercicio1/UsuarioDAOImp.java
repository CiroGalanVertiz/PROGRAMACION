/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DAM120
 */
public class UsuarioDAOImp implements Repositorio<Usuario>{
    
    public Connection getConnection(){
        return AccesoBaseDatos.getInstance().getConn();
    }

    @Override
    public List listar() {
        return null;
    }

    @Override
    public Usuario porId(int Id) {
        Usuario usuario=null;
        String sql="SELECT id,username,password,email FROM usuarios where id=?";
        try(PreparedStatement stmt=getConnection().prepareStatement(sql);){
            stmt.setInt(1, Id);
            try(ResultSet rs=stmt.executeQuery();){
                if(rs.next()){
                    usuario= crearUsuario(rs);
                }
                
            }
        } catch (SQLException ex) {
            
        }
        return usuario;
    }

    @Override
    public void eliminar(int id) {
        String sql="DELETE FROM usuarios WHERE id=?";
        try(PreparedStatement stmt=getConnection().prepareStatement(sql);){
            stmt.setInt(1,id);
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
    public void guardar(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private Usuario crearUsuario(final ResultSet rs) throws SQLException {
        return new Usuario( rs.getString("username"),rs.getString("password"),rs.getString("email"));
    }

    @Override
    public void actualizar(int Id) {
        String sql="UPDATE productos SET username=?,password=?,email=? WHERE id=?";
        try(PreparedStatement stmt=getConnection().prepareStatement(sql);){
            String username=Teclado.nextLine("Introduce el nuevo usuario"); 
            String password=Teclado.nextLine("Introduce la nueva contraseña"); 
            String email=Teclado.nextLine("Introduce el nuevo email");
            stmt.setString(1, username);
            stmt.setString(2,password);
            stmt.setString(3,email);
            stmt.setInt(4,Id);
             int salida = stmt.executeUpdate();
            if (salida != 1) {
                throw new Exception(" No se ha modificado un solo registro");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       
        
    }

    @Override
    public void agregar() {
        String sql="INSERT INTO usuarios (username,password,email) VALUES (?,?,?)";
        try(PreparedStatement stmt=getConnection().prepareStatement(sql);){
            String username=Teclado.nextLine("Introduce el nuevo usuario"); 
            String password=Teclado.nextLine("Introduce la nueva contraseña"); 
            String email=Teclado.nextLine("Introduce el nuevo email");
            stmt.setString(1,username);
            stmt.setString(2,password);
            stmt.setString(3,email);
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

    
}

