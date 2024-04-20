/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celulares;

/**
 *
 * @author USER
 */
public class Celulares {

    public static void main(String[] args) {
        
        
        Modelo1 celular1 = new Modelo1("Samsung", "ABC123", 599.99);
        Modelo2 celular2 = new Modelo2("Apple", "XYZ789", 799.99);
        Modelo3 celular3 = new Modelo3("Huawei", "DEF456", 499.99);

        System.out.println("Celular 1:");
        System.out.println("Marca: " + celular1.getMarca());
        System.out.println("Código: " + celular1.getCod());
        System.out.println("Precio: $" + celular1.getPrecio());

        System.out.println("\nCelular 2:");
        System.out.println("Marca: " + celular2.getMarca());
        System.out.println("Código: " + celular2.getCod());
        System.out.println("Precio: $" + celular2.getPrecio());

        System.out.println("\nCelular 3:");
        System.out.println("Marca: " + celular3.getMarca());
        System.out.println("Código: " + celular3.getCod());
        System.out.println("Precio: $" + celular3.getPrecio());
      
    }
}
