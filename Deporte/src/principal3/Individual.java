/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal3;

/**
 *
 * @author Lenovo
 */
public class Individual extends TipodeDeporte{

    private String jugador;
    
    public Individual (){}
    
    public Individual(String jugador, String nombre, String tipo) {
        super(nombre, tipo);
        this.jugador = jugador;
    }
    /**
     * @return the jugador
     */
    public String getJugador() {
        return jugador;
    }

    /**
     * @param jugador the jugador to set
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
}
