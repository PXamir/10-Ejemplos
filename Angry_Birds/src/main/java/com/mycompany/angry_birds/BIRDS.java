/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.angry_birds;

/**
 *
 * @author Estudiante
 */
public class BIRDS {

    private PERSONAJE bird;
    private Float velocidad;
    private String tipo;
    
    public BIRDS(int par, String normal, PERSONAJE redper) {}

    public BIRDS(Float velocidad, String tipo, PERSONAJE bird) {
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.bird = bird;
    }

    public Float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Float velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PERSONAJE getBird() {
        return bird;
    }

    public void setBird(PERSONAJE bird) {
        this.bird = bird;
    }
    
    
   
}
