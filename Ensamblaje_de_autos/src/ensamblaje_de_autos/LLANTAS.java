/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensamblaje_de_autos;

/**
 *
 * @author ALUMNO
 */
public class LLANTAS {
    
    private PARTES_DATOS wheel_data;
    private LLANTAS_INFO wheel_info;

    public LLANTAS() {}

    public LLANTAS(PARTES_DATOS wheel_data, LLANTAS_INFO wheel_info) {
        this.wheel_data = wheel_data;
        this.wheel_info = wheel_info;
    }

    public PARTES_DATOS getWheel_data() {
        return wheel_data;
    }

    public void setWheel_data(PARTES_DATOS wheel_data) {
        this.wheel_data = wheel_data;
    }

    public LLANTAS_INFO getWheel_info() {
        return wheel_info;
    }

    public void setWheel_info(LLANTAS_INFO wheel_info) {
        this.wheel_info = wheel_info;
    }
    
    
    
}
