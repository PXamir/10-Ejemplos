/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasedeanimales;

/**
 *
 * @author USER
 */
public class Mascota extends Animal {
    
    
    private String dueño;

    // Constructor
    public Mascota(String nombre, int edad, String especie, String dueño) {
        super(nombre, edad, especie);
        this.dueño = dueño;
    }

    // Getter y setter adicional
    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
}

