/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.circuitos;

/**
 *
 * @author ALUMNO
 */
public class PARTES {
    
    private String cod_id;
    private String nombre;

    public PARTES() {}

    public PARTES(String cod_id, String nombre) {
        this.cod_id = cod_id;
        this.nombre = nombre;
    }

    public String getCod_id() {
        return cod_id;
    }

    public void setCod_id(String cod_id) {
        this.cod_id = cod_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
