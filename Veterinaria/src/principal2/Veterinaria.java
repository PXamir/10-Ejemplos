/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal2;

/**
 *
 * @author Lenovo
 */
public class Veterinaria {

    private Gato gato;
    private Perro perro;
    private Ave ave;
    
    public Veterinaria(){}
    
    public Veterinaria(Gato gato, Perro perro, Ave ave) {
        this.gato = gato;
        this.perro = perro;
        this.ave = ave;
    }
    /**
     * @return the gato
     */
    public Gato getGato() {
        return gato;
    }

    /**
     * @param gato the gato to set
     */
    public void setGato(Gato gato) {
        this.gato = gato;
    }

    /**
     * @return the perro
     */
    public Perro getPerro() {
        return perro;
    }

    /**
     * @param perro the perro to set
     */
    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    /**
     * @return the ave
     */
    public Ave getAve() {
        return ave;
    }

    /**
     * @param ave the ave to set
     */
    public void setAve(Ave ave) {
        this.ave = ave;
    }
}
