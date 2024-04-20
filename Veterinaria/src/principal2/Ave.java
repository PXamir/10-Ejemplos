/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal2;

/**
 *
 * @author Lenovo
 */
public class Ave extends TipodeMascota{

   private String tipo;
   
   public Ave(){}
    
    public Ave(String tipo, String nombre, String dueño) {
        super(nombre, dueño);
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
