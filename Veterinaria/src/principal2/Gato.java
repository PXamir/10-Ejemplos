/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal2;

/**
 *
 * @author Lenovo
 */
public class Gato extends TipodeMascota{

    private String dieta;
    
    public Gato(){}
    
    public Gato(String dieta, String nombre, String dueño) {
        super(nombre, dueño);
        this.dieta = dieta;
    }
    /**
     * @return the dieta
     */
    public String getDieta() {
        return dieta;
    }

    /**
     * @param dieta the dieta to set
     */
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
