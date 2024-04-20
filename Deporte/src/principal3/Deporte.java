/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal3;

/**
 *
 * @author Lenovo
 */
public class Deporte {

    private Colectivo colectivo;
    private Individual individual;
    private Grupal grupal;
    
    public Deporte(Grupal grup, Colectivo colec, Individual indi){}
    
    public Deporte(Colectivo colectivo, Individual individual, Grupal grupal) {
        this.colectivo = colectivo;
        this.individual = individual;
        this.grupal = grupal;
    }
    /**
     * @return the colectivo
     */
    public Colectivo getColectivo() {
        return colectivo;
    }

    /**
     * @param colectivo the colectivo to set
     */
    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    /**
     * @return the individual
     */
    public Individual getIndividual() {
        return individual;
    }

    /**
     * @param individual the individual to set
     */
    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    /**
     * @return the grupal
     */
    public Grupal getGrupal() {
        return grupal;
    }

    /**
     * @param grupal the grupal to set
     */
    public void setGrupal(Grupal grupal) {
        this.grupal = grupal;
    }
}
