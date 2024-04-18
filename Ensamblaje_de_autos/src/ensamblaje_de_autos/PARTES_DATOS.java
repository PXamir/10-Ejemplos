/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensamblaje_de_autos;

/**
 *
 * @author ALUMNO
 */
public class PARTES_DATOS {
    
    private String codigo;
    private String modelo;
    private String fech_fabricacion;

    public PARTES_DATOS() {}

    public PARTES_DATOS(String codigo, String modelo, String fech_fabricacion) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.fech_fabricacion = fech_fabricacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFech_fabricacion() {
        return fech_fabricacion;
    }

    public void setFech_fabricacion(String fech_fabricacion) {
        this.fech_fabricacion = fech_fabricacion;
    }
    
}
