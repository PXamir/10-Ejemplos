/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediosdetransporte;

/**
 *
 * @author USER
 */
public class Bus extends Vehiculo {
    

    public Bus(){}
    
    private int capacidadPasajeros;

    // Constructor
    public Bus(String marca, String modelo, int año, int capacidadPasajeros) {
        super(marca, modelo, año);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    // Getter y setter adicional
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
   
    
}
