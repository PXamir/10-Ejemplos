/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.angry_birds;

/**
 *
 * @author Estudiante
 */
public class PERSONAJE {
    
    private float peso;
    private String sonido;
    private String modelo;

    public PERSONAJE() {}

    public PERSONAJE(float peso, String sonido, String modelo) {
        this.peso = peso;
        this.sonido = sonido;
        this.modelo = modelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
