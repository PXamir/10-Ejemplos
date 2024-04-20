/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.angry_birds;

/**
 *
 * @author Estudiante
 */
public class ESPACIO {
    
    private String escenario;
    private float gravedad;
    private int nivel;

    public ESPACIO() {}

    public ESPACIO(String escenario, float gravedad, int nivel) {
        this.escenario = escenario;
        this.gravedad = gravedad;
        this.nivel = nivel;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public float getGravedad() {
        return gravedad;
    }

    public void setGravedad(Float gravedad) {
        this.gravedad = gravedad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
