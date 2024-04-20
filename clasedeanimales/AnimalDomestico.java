/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasedeanimales;

/**
 *
 * @author USER
 */

public class AnimalDomestico extends Animal {
    
    
    private boolean vacunado;

    // Constructor
    public AnimalDomestico(String nombre, int edad, String especie, boolean vacunado) {
        super(nombre, edad, especie);
        this.vacunado = vacunado;
    }

    // Getter y setter adicional
    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
}
    

