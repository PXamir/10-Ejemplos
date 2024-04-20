/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal2;

/**
 *
 * @author Lenovo
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato cat = new Gato("Roedores","Pelusa","Carlos");
        Perro dog = new Perro("Pitbull","Rocky","Luis");
        Ave bird = new Ave("Perico","Juanchi","Xiomara");
        
        Veterinaria veterinaria = new Veterinaria(cat,dog,bird);
        
        System.out.println("Nombre: " + cat.getNombre() + ", Dieta: " + cat.getDieta() + ", Dueño: " + cat.getDueño());
        System.out.println("Nombre: " + dog.getNombre() + ", Raza: " + dog.getRaza() + ", Dueño: " + dog.getDueño());
        System.out.println("Nombre: " + bird.getNombre() + ", Tipo: " + bird.getTipo() + ", Dueño: " + bird.getDueño());
    }
    
}
