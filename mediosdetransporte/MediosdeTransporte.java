/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediosdetransporte;

/**
 *
 * @author USER
 */
public class MediosdeTransporte {

    public static void main(String[] args) {
        
        
        Carro sedan = new Carro("Toyota", "Corolla", 2022, 4);
        // Mostrar información del automóvil
        System.out.println("Automóvil:");
        System.out.println("Marca: " + sedan.getMarca());
        System.out.println("Modelo: " + sedan.getModelo());
        System.out.println("Año: " + sedan.getAño());
        System.out.println("Número de puertas: " + sedan.getNumPuertas());
        System.out.println();

        // Crear un objeto Motocicleta
        Moto deportiva = new Moto("Honda", "CBR500R", 2021, "Deportiva");
        // Mostrar información de la motocicleta
        System.out.println("Motocicleta:");
        System.out.println("Marca: " + deportiva.getMarca());
        System.out.println("Modelo: " + deportiva.getModelo());
        System.out.println("Año: " + deportiva.getAño());
        System.out.println("Tipo: " + deportiva.getTipo());
        System.out.println();

        // Crear un objeto TransportePublico
        Bus autobus = new Bus("Mercedes-Benz", "Sprinter", 2019, 30);
        // Mostrar información del transporte público
        System.out.println("Transporte Público:");
        System.out.println("Marca: " + autobus.getMarca());
        System.out.println("Modelo: " + autobus.getModelo());
        System.out.println("Año: " + autobus.getAño());
        System.out.println("Capacidad de pasajeros: " + autobus.getCapacidadPasajeros());
    }
}
