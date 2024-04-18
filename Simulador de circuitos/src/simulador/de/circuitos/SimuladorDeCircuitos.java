/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulador.de.circuitos;

/**
 *
 * @author ALUMNO
 */
public class SimuladorDeCircuitos {

    
    public static void main(String[] args) {
        
        
        ESPACIO espacio_px = new ESPACIO("#FFFFFF", 5, 5);
        SUPPLY_POWER bateria5v = new SUPPLY_POWER( 5,"P001", "batería 5V");
        CABLE crojo = new CABLE ("#FF0000", "C001", "cable rojo");
        RESISTOR resistencia300 = new RESISTOR (330, "R003", "resistencia 300Ω");
        LED ledazul = new LED ("#0000FF", "L002", "LED azul");
        
    }
    
}
