/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cococ
 */
public class MetodosBD {

    public static Connection getConnection() {
        return AccesoBaseDatos.getInstance().getConn();
    }

    public static void muestraActividad() {
        for (Actividad e : listarActividades()) {
            System.out.println(e.toString());
        }

    }

    private static List<Actividad> listarActividades() {
        List<Actividad> actividades = new ArrayList<>();
        Actividad actividad;
        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT id,nombre,plazasLibres,dia,hora FROM actividades");) {
            while (rs.next()) {
                actividad = crearActividad(rs);
                actividades.add(actividad);
            }

        } catch (SQLException ex) {
        }
        return actividades;
    }

    public static void realizarInscripcion(String DNI) {
        System.out.println("¿A que te quieres apuntar?");
        muestraActividad();
        Actividad actividad = null;
        String sqlI = "INSERT INTO Participantes(DNI,nombre,IdActividad) VALUES(?,?,?)";
        String sqlU = "UPDATE Actividades SET plazasLibres = plazasLibres - 1 WHERE nombre = ?";
        try {
            getConnection().setAutoCommit(false);
            actividad = validarActividad(Teclado.nextInt());
            System.out.println(actividad);
            if (actividad != null && validarParticipante(DNI) == null) {
                try (PreparedStatement stmt = getConnection().prepareStatement(sqlI)) {
                    String nombre = Teclado.nextLine("Introduce tu nombre");
                    stmt.setString(1, DNI);
                    stmt.setString(2, nombre);
                    stmt.setInt(3, actividad.getId());
                    int salida = stmt.executeUpdate();
                    if (salida != 1) {
                        throw new SQLException("no se ha insertado nada");
                    } else {
                        try (PreparedStatement stmtU = getConnection().prepareStatement(sqlU)) {
                            stmtU.setString(1, actividad.getNombre());
                            int salida2 = stmtU.executeUpdate();
                            if (salida2 != 1) {
                                throw new SQLException("no se ha modificado nada");
                            } else {
                                getConnection().commit();
                                getConnection().setAutoCommit(true);
                            }
                        }
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    try {
                        getConnection().rollback();
                    } catch (SQLException e) {

                    }

                }

            } else {
                throw new SQLException("no se ha encontrado la actividad o ya participa en una actividad");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            try {
                getConnection().rollback();
            } catch (SQLException e) {

            }
        }

    }

    private static Participante validarParticipante(String DNI) {
        Participante participante = null;
        String sql = "SELECT dni,nombre,IdActividad FROM Participantes WHERE dni = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, DNI);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {

                    participante = crearParticipante(rs);
                    System.out.println("actividad encontrada");
                }
            }
        } catch (SQLException e) {

        }
        return participante;

    }

    private static Actividad validarActividad(int id) {
        Actividad actividad = null;
        String sql = "SELECT id,nombre,plazasLibres,dia,hora FROM actividades WHERE id = ? AND plazasLibres>0";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setInt(1, id);
            System.out.println("hola");

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println();
                actividad = crearActividad(rs);
                System.out.println("actividad encontrada");
            } else {
                // No se encontró la actividad
                System.out.println("actividad no encontrada");
            }
        } catch (SQLException e) {

        }
        return actividad;
    }

    private static Actividad crearActividad(final ResultSet rs) throws SQLException {
        return new Actividad(rs.getInt(1), rs.getString("nombre"), rs.getInt(3), rs.getString("dia"), rs.getString("hora"));
    }

    private static Participante crearParticipante(final ResultSet rs) throws SQLException {
        return new Participante(rs.getString(1), rs.getString(2), validarActividad(rs.getInt(3)));
    }

}
