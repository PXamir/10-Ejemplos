/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.angry_birds;

/**
 *
 * @author Estudiante
 */
public class CERDOS {
    
    private PERSONAJE cerdo;
    private int vida;

    public CERDOS() {}

    public CERDOS(PERSONAJE cerdo, int vida) {
        this.cerdo = cerdo;
        this.vida = vida;
    }

    public PERSONAJE getCerdo() {
        return cerdo;
    }

    public void setCerdo(PERSONAJE cerdo) {
        this.cerdo = cerdo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
