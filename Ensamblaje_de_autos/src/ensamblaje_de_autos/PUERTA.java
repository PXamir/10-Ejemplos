/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensamblaje_de_autos;

/**
 *
 * @author ALUMNO
 */
public class PUERTA {
    
    private PARTES_DATOS door_data;
    private PUERTA_INFO door_info;

    public PUERTA() {}

    public PUERTA(PARTES_DATOS door_data, PUERTA_INFO door_info) {
        this.door_data = door_data;
        this.door_info = door_info;
    }

    public PARTES_DATOS getDoor_data() {
        return door_data;
    }

    public void setDoor_data(PARTES_DATOS door_data) {
        this.door_data = door_data;
    }

    public PUERTA_INFO getDoor_info() {
        return door_info;
    }

    public void setDoor_info(PUERTA_INFO door_info) {
        this.door_info = door_info;
    }
    
}
