/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal1;

/**
 *
 * @author Lenovo
 */
public class Electrodomestico extends NecesidadesBasicas{

    private String utilidad;
    
    public Electrodomestico(){}
    
    public Electrodomestico(String utilidad, String nombre, String precio) {
        super(nombre, precio);
        this.utilidad = utilidad;
    }
    
    /**
     * @return the utilidad
     */
    public String getUtilidad() {
        return utilidad;
    }

    /**
     * @param utilidad the utilidad to set
     */
    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }
    
}
