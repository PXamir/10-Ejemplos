/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.circuitos;

/**
 *
 * @author ALUMNO
 */
public class RESISTOR extends PARTES{
    
    private float ohm;

    public RESISTOR() {}

    public RESISTOR(float ohm, String cod_id, String nombre) {
        super(cod_id, nombre);
        this.ohm = ohm;
        
    }

    public float getOhm() {
        return ohm;
    }

    public void setOhm(float ohm) {
        this.ohm = ohm;
    }
}
