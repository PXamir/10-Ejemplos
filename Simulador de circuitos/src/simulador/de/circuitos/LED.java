/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.circuitos;

/**
 *
 * @author ALUMNO
 */
public class LED extends PARTES {
    
    private String color;

    public LED() {}

    public LED(String color, String cod_id, String nombre) {
        super(cod_id, nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
