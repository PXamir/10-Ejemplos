/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal3;

/**
 *
 * @author Lenovo
 */
public class Principal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grupal grup = new Grupal("22","Roberto","Boxeo");
        Colectivo colec = new Colectivo("11","Arsenal","Futbol");
        Individual indi = new Individual("Ufis","Carolina","Atletismo");
        
        Deporte deporte = new Deporte(grup,colec,indi);
        
        System.out.println("Edad: " + grup.getEdad() + ", Nombre: " + grup.getNombre() + ", Deporte: " + grup.getTipo());
        System.out.println("Numero de jugadores: " + colec.getNumjugadores() + ", Nombre del equipo: " + colec.getNombre() + ", Deporte: " + colec.getTipo());
        System.out.println("Nombre: " + indi.getNombre() + ", Nombre del equipo: " + indi.getJugador() + ", Deporte: " + indi.getTipo());
        
    }
    
}
