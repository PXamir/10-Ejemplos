/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensamblaje_de_autos;

/**
 *
 * @author ALUMNO
 */
public class CARROCERIA {
    
    private PARTES_DATOS carro_data;
    private CARROCERIA_INFO carro_info;

    public CARROCERIA() {}

    public CARROCERIA(PARTES_DATOS carro_data, CARROCERIA_INFO carro_info) {
        this.carro_data = carro_data;
        this.carro_info = carro_info;
    }

    public PARTES_DATOS getCarro_data() {
        return carro_data;
    }

    public void setCarro_data(PARTES_DATOS carro_data) {
        this.carro_data = carro_data;
    }

    public CARROCERIA_INFO getCarro_info() {
        return carro_info;
    }

    public void setCarro_info(CARROCERIA_INFO carro_info) {
        this.carro_info = carro_info;
    }
    
}
