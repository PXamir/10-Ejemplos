/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal1;

/**
 *
 * @author Lenovo
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Electrodomestico elect = new Electrodomestico("cocina","lavadora","1250.00");
        Ropa rop = new Ropa("lana","polo","35.00");
        Alimento alimen = new Alimento("Fruta","Manzana","2.00");
        
        Producto produc = new Producto(elect,rop,alimen);
        
        System.out.println("Prodcuto: " + elect.getNombre() + ", Utilidad: " + elect.getUtilidad() + ", Precio: " + elect.getPrecio());
        System.out.println("Prodcuto: " + rop.getNombre() + ", Material: " + rop.getMaterial() + ", Precio: " + rop.getPrecio());
        System.out.println("Prodcuto: " + alimen.getNombre() + ", Tipo: " + alimen.getTipo() + ", Precio: " + alimen.getPrecio());
    }
    
}
