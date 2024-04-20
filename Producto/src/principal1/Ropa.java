/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal1;

/**
 *
 * @author Lenovo
 */
public class Ropa extends NecesidadesBasicas{

    private String material;
    
    public Ropa(){}
    
    public Ropa(String material, String nombre, String precio) {
        super(nombre, precio);
        this.material = material;
    }
    
    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
}
