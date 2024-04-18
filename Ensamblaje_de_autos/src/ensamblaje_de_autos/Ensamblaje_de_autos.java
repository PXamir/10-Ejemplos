/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ensamblaje_de_autos;

/**
 *
 * @author ALUMNO
 */
public class Ensamblaje_de_autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PARTES_DATOS carro_data = new PARTES_DATOS("C001", "LaFerrari", "10/02/2024");
        CARROCERIA_INFO carro_info = new CARROCERIA_INFO("#FF0000","Metal");
        
        CARROCERIA laferrari_carro = new CARROCERIA(carro_data, carro_info);
        
        PARTES_DATOS wheel_data = new PARTES_DATOS("W001", "LaFerrari", "30/12/2023");
        LLANTAS_INFO wheel_info = new LLANTAS_INFO("deportivo", "FE004");
        
        LLANTAS laferrari_wheel = new LLANTAS(wheel_data, wheel_info);
        
                
        PARTES_DATOS door_data = new PARTES_DATOS("D005", "LaFerrari", "28/12/2023");
        PUERTA_INFO door_info = new PUERTA_INFO()
        
        PUERTA laferrari_door = new PUERTA(door_data, door_info);
        
        
    }
    
}
