/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal3;

/**
 *
 * @author Lenovo
 */
public class Grupal extends TipodeDeporte{

    private String edad;
    
    public Grupal(){}
    
    public Grupal(String edad, String nombre, String tipo) {
        super(nombre, tipo);
        this.edad = edad;
    }
    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
}
