/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.circuitos;

/**
 *
 * @author ALUMNO
 */
public class ESPACIO {
    
    private String color;
    private int alto;
    private int ancho;

    public ESPACIO() {}

    public ESPACIO(String color, int alto, int ancho) {
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
