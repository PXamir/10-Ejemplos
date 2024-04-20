/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal2;

/**
 *
 * @author Lenovo
 */
public class TipodeMascota {

    private String nombre;
    private String dueño;
    
    public TipodeMascota (){}
    
    public TipodeMascota(String nombre, String dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dueño
     */
    public String getDueño() {
        return dueño;
    }

    /**
     * @param dueño the dueño to set
     */
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
}
