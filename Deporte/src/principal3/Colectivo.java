/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal3;

/**
 *
 * @author Lenovo
 */
public class Colectivo extends TipodeDeporte{

    private String numjugadores;
    
    public Colectivo(){}
    
    public Colectivo(String numjugadores, String nombre, String tipo) {
        super(nombre, tipo);
        this.numjugadores = numjugadores;
    }
    /**
     * @return the numjugadores
     */
    public String getNumjugadores() {
        return numjugadores;
    }

    /**
     * @param numjugadores the numjugadores to set
     */
    public void setNumjugadores(String numjugadores) {
        this.numjugadores = numjugadores;
    }
}
