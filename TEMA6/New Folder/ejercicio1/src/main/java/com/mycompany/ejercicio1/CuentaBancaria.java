/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author DAM120
 */
public abstract class CuentaBancaria extends Persona implements Identificable {
    private Persona titular;
    private double saldo;
    private String entidad;
    private String oficina;
    private String cuenta;

    public CuentaBancaria(Persona titular, String entidad, String oficina, String cuenta) {
        this.titular = titular;
        this.entidad = entidad;
        this.oficina = oficina;
        this.cuenta = cuenta;
    }
    
    
    
    public abstract void ingresar(double cantidad);
    public abstract void retirar(double cantidad);

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
}
