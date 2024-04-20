/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediosdetransporte;

/**
 *
 * @author USER
 */
public class Moto extends Vehiculo{
    
    
    public Moto(){}    
    
    private String tipo;

    public Moto(String marca, String modelo, int año, String tipo) {
        super(marca, modelo, año);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
