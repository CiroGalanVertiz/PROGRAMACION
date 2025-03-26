/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Map;

/**
 *
 * @author DAM120
 */
public class CuentaAhorro extends CuentaBancaria {
    
    private double tipoInteres;
    private final double MIN_TIPO_INTERES;
    private final double MAX_TIPO_INTERES;

    @Override
    public void ingresar(double cantidad) {
    }

    @Override
    public void retirar(double cantidad) {
    }

    @Override
    public Map<String, String> listaObjetos() {
        return null;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    

}
