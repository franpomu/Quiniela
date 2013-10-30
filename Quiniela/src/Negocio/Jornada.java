/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;

/**
 *
 * @author iTo
 */
public class Jornada {

    private int idJornada;
    private String equipoLocal;
    private int idEquipoLocal;
    private int idEquipoVisitante;
    private double golesLocal;
    private double golesVisitante;
    private String equipoVisitante;
    private int jornada;
    private List<Equipo> equipo;

    public Jornada() {
    }

    /**
     * @return the idJornada
     */
    public int getIdJornada() {
        return idJornada;
    }

    /**
     * @param idJornada the idJornada to set
     */
    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    /**
     * @return the equipoLocal
     */
    public String getEquipoLocal() {
        return equipoLocal;
    }

    /**
     * @param equipoLocal the equipoLocal to set
     */
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    /**
     * @return the equipoVisitante
     */
    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    /**
     * @param equipoVisitante the equipoVisitante to set
     */
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    /**
     * @return the jornada
     */
    public int getJornada() {
        return jornada;
    }

    /**
     * @param jornada the jornada to set
     */
    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    /**
     * @return the golesLocal
     */
    public double getGolesLocal() {
        return golesLocal;
    }

    /**
     * @param golesLocal the golesLocal to set
     */
    public void setGolesLocal(double golesLocal) {
        this.golesLocal = golesLocal;
    }

    /**
     * @return the golesVisitante
     */
    public double getGolesVisitante() {
        return golesVisitante;
    }

    /**
     * @param golesVisitante the golesVisitante to set
     */
    public void setGolesVisitante(double golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    /**
     * @return the equipo
     */
    public List<Equipo> getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(List<Equipo> equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the idEquipoLocal
     */
    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }

    /**
     * @param idEquipoLocal the idEquipoLocal to set
     */
    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    /**
     * @return the idEquipoVisitante
     */
    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    /**
     * @param idEquipoVisitante the idEquipoVisitante to set
     */
    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }
}
