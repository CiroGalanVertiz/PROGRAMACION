/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author cococ
 */
public class AccesoBaseDatos {
    private final String BD="java_02_clinica";
    private final String username="root";
    private final String password="mysql";
    private final String URL="jdbc:mysql://localhost:3306/"+BD;
    private Connection conn=null;
    
    private AccesoBaseDatos(){
        try{
        Properties properties= new Properties();
        properties.setProperty("user",username);
        properties.setProperty("password",password);
        properties.setProperty("useSSL","false");
        properties.setProperty("autoReconnect","true");
        conn= (Connection) DriverManager.getConnection(URL,properties);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public static AccesoBaseDatos getInstance() {
        return AccesoBaseDatosHolder.INSTANCE;
    }
    
    private static class AccesoBaseDatosHolder {

        private static final AccesoBaseDatos INSTANCE = new AccesoBaseDatos();
    }

    public Connection getConn() {
        return conn;
    }
    
}
