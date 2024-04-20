/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal1;

/**
 *
 * @author Lenovo
 */
public class Producto {

    private Electrodomestico electrodomestico;
    private Ropa ropa;
    private Alimento alimento;
    
    public Producto(Electrodomestico electrodomestico, Ropa ropa, Alimento alimento) {
        this.electrodomestico = electrodomestico;
        this.ropa = ropa;
        this.alimento = alimento;
    }
    /**
     * @return the electrodomestico
     */
    public Electrodomestico getElectrodomestico() {
        return electrodomestico;
    }

    /**
     * @param electrodomestico the electrodomestico to set
     */
    public void setElectrodomestico(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    /**
     * @return the ropa
     */
    public Ropa getRopa() {
        return ropa;
    }

    /**
     * @param ropa the ropa to set
     */
    public void setRopa(Ropa ropa) {
        this.ropa = ropa;
    }

    /**
     * @return the alimento
     */
    public Alimento getAlimento() {
        return alimento;
    }

    /**
     * @param alimento the alimento to set
     */
    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }
}
