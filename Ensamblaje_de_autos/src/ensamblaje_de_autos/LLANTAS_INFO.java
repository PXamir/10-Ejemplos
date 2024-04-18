/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensamblaje_de_autos;

/**
 *
 * @author ALUMNO
 */
public class LLANTAS_INFO {
    
    private String tipo;
    private String ring_model;

    public LLANTAS_INFO() {}

    public LLANTAS_INFO(String tipo, String ring_model) {
        this.tipo = tipo;
        this.ring_model = ring_model;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRing_model() {
        return ring_model;
    }

    public void setRing_model(String ring_model) {
        this.ring_model = ring_model;
    }
    
}
