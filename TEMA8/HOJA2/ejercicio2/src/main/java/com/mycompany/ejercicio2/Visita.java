/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author cococ
 */
public class Visita {
    private int id;
    private Paciente paciente;
    private LocalDate fecha;
    private Tratamiento tratamiento;
    private String observaciones;

    public Visita(Paciente paciente, LocalDate fecha, Tratamiento tratamiento, String observaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
}
