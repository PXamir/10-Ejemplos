/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasedeanimales;

/**
 *
 * @author USER
 */
public class ClasedeAnimales {

    public static void main(String[] args) {
        
        
        // Crear un objeto Mascota
        Mascota perro = new Mascota("Bobby", 3, "Perro", "Piero");
        // Mostrar información de la mascota
        System.out.println("Mascota:");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Edad: " + perro.getEdad());
        System.out.println("Especie: " + perro.getEspecie());
        System.out.println("Dueño: " + perro.getDueño());
        System.out.println();

        // Crear un objeto AnimalSalvaje
        AnimalSalvaje tigre = new AnimalSalvaje("Tony", 5, "Tigre", "Selva");
        // Mostrar información del animal salvaje
        System.out.println("Animal Salvaje:");
        System.out.println("Nombre: " + tigre.getNombre());
        System.out.println("Edad: " + tigre.getEdad());
        System.out.println("Especie: " + tigre.getEspecie());
        System.out.println("Habitat: " + tigre.getHabitat());
        System.out.println();

        // Crear un objeto AnimalDomestico
        AnimalDomestico gato = new AnimalDomestico("Chira", 2, "Gato", true);
        // Mostrar información del animal doméstico
        System.out.println("Animal Doméstico:");
        System.out.println("Nombre: " + gato.getNombre());
        System.out.println("Edad: " + gato.getEdad());
        System.out.println("Especie: " + gato.getEspecie());
        System.out.println("¿Vacunado?: " + (gato.isVacunado() ? "Sí" : "No"));
    }    
}
