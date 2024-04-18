/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.circuitos;

/**
 *
 * @author ALUMNO
 */
public class SUPPLY_POWER extends PARTES{

    private float voltaje;
    
    
    public SUPPLY_POWER() {
    }


    public SUPPLY_POWER(float voltaje, String cod_id, String nombre) {
        super(cod_id, nombre);
        this.voltaje = voltaje;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }  
}
