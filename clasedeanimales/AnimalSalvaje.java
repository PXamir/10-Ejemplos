/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasedeanimales;

/**
 *
 * @author USER
 */
public class AnimalSalvaje extends Animal {
    
    
    private String habitat;

    // Constructor
    public AnimalSalvaje(String nombre, int edad, String especie, String habitat) {
        super(nombre, edad, especie);
        this.habitat = habitat;
    }

    // Getter y setter adicional
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
