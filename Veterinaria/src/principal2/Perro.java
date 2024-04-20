/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal2;

/**
 *
 * @author Lenovo
 */
public class Perro extends TipodeMascota{

    private String raza;
    
    public Perro(){}
    
    public Perro(String raza, String nombre, String dueño) {
        super(nombre, dueño);
        this.raza = raza;
    }
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
