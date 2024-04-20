/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal1;

/**
 *
 * @author Lenovo
 */
public class Alimento extends NecesidadesBasicas{

    private String tipo;
    
    public Alimento() {}
    
    public Alimento(String tipo, String nombre, String precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
