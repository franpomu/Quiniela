/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iTo
 */
public class Equipo {

    private Integer idEquipo;
    private String nombreEquipo;
    private Integer formaEquipo;
    private TipoLiga tipoLiga;
    private Integer jugadorClave;
    private Integer puntosEquipo;
    private String equipoGrande;
    //Jugados
    private float partidosJugados;
    private float partidosGanados;
    private float partidosPerdidos;
    private float partidosEmpatados;
    //Casa
    private float partidosJugadosCasa;
    private float partidosGanadosCasa;
    private float partidosPerdidosCasa;
    private float partidosEmpatadosCasa;
    //Fuera
    private float partidosJugadosFuera;
    private float partidosGanadosFuera;
    private float partidosPerdidosFuera;
    private float partidosEmpatadosFuera;
    //Goles
    private float goles;
    private float golesFavor;
    private float golesContra;
    //GolesCasa
    private float golesFavorCasa;
    private float golesContraCasa;
    //GolesFuera
    private float golesFavorFuera;
    private float golesContraFuera;

    /**
     * @return the idEquipo
     */
    public Integer getIdEquipo() {
        return idEquipo;
    }

    /**
     * @param idEquipo the idEquipo to set
     */
    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * @return the tipoLiga
     */
    public TipoLiga getTipoLiga() {
        return tipoLiga;
    }

    /**
     * @param tipoLiga the tipoLiga to set
     */
    public void setTipoLiga(TipoLiga tipoLiga) {
        this.tipoLiga = tipoLiga;
    }

    /**
     * @return the puntosEquipo
     */
    public Integer getPuntosEquipo() {
        return puntosEquipo;
    }

    /**
     * @param puntosEquipo the puntosEquipo to set
     */
    public void setPuntosEquipo(Integer puntosEquipo) {
        this.puntosEquipo = puntosEquipo;
    }

    /**
     * @return the formaEquipo
     */
    public Integer getFormaEquipo() {
        return formaEquipo;
    }

    /**
     * @param formaEquipo the formaEquipo to set
     */
    public void setFormaEquipo(Integer formaEquipo) {
        this.formaEquipo = formaEquipo;
    }

    /**
     * @return the jugadorClave
     */
    public Integer getJugadorClave() {
        return jugadorClave;
    }

    /**
     * @param jugadorClave the jugadorClave to set
     */
    public void setJugadorClave(Integer jugadorClave) {
        this.jugadorClave = jugadorClave;
    }

    /**
     * @return the partidosJugados
     */
    public float getPartidosJugados() {
        return partidosJugados;
    }

    /**
     * @param partidosJugados the partidosJugados to set
     */
    public void setPartidosJugados(float partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    /**
     * @return the partidosGanados
     */
    public float getPartidosGanados() {
        return partidosGanados;
    }

    /**
     * @param partidosGanados the partidosGanados to set
     */
    public void setPartidosGanados(float partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    /**
     * @return the partidosPerdidos
     */
    public float getPartidosPerdidos() {
        return partidosPerdidos;
    }

    /**
     * @param partidosPerdidos the partidosPerdidos to set
     */
    public void setPartidosPerdidos(float partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    /**
     * @return the partidosEmpatados
     */
    public float getPartidosEmpatados() {
        return partidosEmpatados;
    }

    /**
     * @param partidosEmpatados the partidosEmpatados to set
     */
    public void setPartidosEmpatados(float partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    /**
     * @return the partidosJugadosCasa
     */
    public float getPartidosJugadosCasa() {
        return partidosJugadosCasa;
    }

    /**
     * @param partidosJugadosCasa the partidosJugadosCasa to set
     */
    public void setPartidosJugadosCasa(float partidosJugadosCasa) {
        this.partidosJugadosCasa = partidosJugadosCasa;
    }

    /**
     * @return the partidosGanadosCasa
     */
    public float getPartidosGanadosCasa() {
        return partidosGanadosCasa;
    }

    /**
     * @param partidosGanadosCasa the partidosGanadosCasa to set
     */
    public void setPartidosGanadosCasa(float partidosGanadosCasa) {
        this.partidosGanadosCasa = partidosGanadosCasa;
    }

    /**
     * @return the partidosPerdidosCasa
     */
    public float getPartidosPerdidosCasa() {
        return partidosPerdidosCasa;
    }

    /**
     * @param partidosPerdidosCasa the partidosPerdidosCasa to set
     */
    public void setPartidosPerdidosCasa(float partidosPerdidosCasa) {
        this.partidosPerdidosCasa = partidosPerdidosCasa;
    }

    /**
     * @return the partidosEmpatadosCasa
     */
    public float getPartidosEmpatadosCasa() {
        return partidosEmpatadosCasa;
    }

    /**
     * @param partidosEmpatadosCasa the partidosEmpatadosCasa to set
     */
    public void setPartidosEmpatadosCasa(float partidosEmpatadosCasa) {
        this.partidosEmpatadosCasa = partidosEmpatadosCasa;
    }

    /**
     * @return the partidosJugadosFuera
     */
    public float getPartidosJugadosFuera() {
        return partidosJugadosFuera;
    }

    /**
     * @param partidosJugadosFuera the partidosJugadosFuera to set
     */
    public void setPartidosJugadosFuera(float partidosJugadosFuera) {
        this.partidosJugadosFuera = partidosJugadosFuera;
    }

    /**
     * @return the partidosGanadosFuera
     */
    public float getPartidosGanadosFuera() {
        return partidosGanadosFuera;
    }

    /**
     * @param partidosGanadosFuera the partidosGanadosFuera to set
     */
    public void setPartidosGanadosFuera(float partidosGanadosFuera) {
        this.partidosGanadosFuera = partidosGanadosFuera;
    }

    /**
     * @return the partidosPerdidosFuera
     */
    public float getPartidosPerdidosFuera() {
        return partidosPerdidosFuera;
    }

    /**
     * @param partidosPerdidosFuera the partidosPerdidosFuera to set
     */
    public void setPartidosPerdidosFuera(float partidosPerdidosFuera) {
        this.partidosPerdidosFuera = partidosPerdidosFuera;
    }

    /**
     * @return the partidosEmpatadosFuera
     */
    public float getPartidosEmpatadosFuera() {
        return partidosEmpatadosFuera;
    }

    /**
     * @param partidosEmpatadosFuera the partidosEmpatadosFuera to set
     */
    public void setPartidosEmpatadosFuera(float partidosEmpatadosFuera) {
        this.partidosEmpatadosFuera = partidosEmpatadosFuera;
    }

    /**
     * @return the goles
     */
    public float getGoles() {
        return goles;
    }

    /**
     * @param goles the goles to set
     */
    public void setGoles(float goles) {
        this.goles = goles;
    }

    /**
     * @return the golesFavor
     */
    public float getGolesFavor() {
        return golesFavor;
    }

    /**
     * @param golesFavor the golesFavor to set
     */
    public void setGolesFavor(float golesFavor) {
        this.golesFavor = golesFavor;
    }

    /**
     * @return the golesContra
     */
    public float getGolesContra() {
        return golesContra;
    }

    /**
     * @param golesContra the golesContra to set
     */
    public void setGolesContra(float golesContra) {
        this.golesContra = golesContra;
    }

    /**
     * @return the golesFavorCasa
     */
    public float getGolesFavorCasa() {
        return golesFavorCasa;
    }

    /**
     * @param golesFavorCasa the golesFavorCasa to set
     */
    public void setGolesFavorCasa(float golesFavorCasa) {
        this.golesFavorCasa = golesFavorCasa;
    }

    /**
     * @return the golesContraCasa
     */
    public float getGolesContraCasa() {
        return golesContraCasa;
    }

    /**
     * @param golesContraCasa the golesContraCasa to set
     */
    public void setGolesContraCasa(float golesContraCasa) {
        this.golesContraCasa = golesContraCasa;
    }

    /**
     * @return the golesFavorFuera
     */
    public float getGolesFavorFuera() {
        return golesFavorFuera;
    }

    /**
     * @param golesFavorFuera the golesFavorFuera to set
     */
    public void setGolesFavorFuera(float golesFavorFuera) {
        this.golesFavorFuera = golesFavorFuera;
    }

    /**
     * @return the golesContraFuera
     */
    public float getGolesContraFuera() {
        return golesContraFuera;
    }

    /**
     * @param golesContraFuera the golesContraFuera to set
     */
    public void setGolesContraFuera(float golesContraFuera) {
        this.golesContraFuera = golesContraFuera;
    }

    /**
     * @return the equipoGrande
     */
    public String getEquipoGrande() {
        return equipoGrande;
    }

    /**
     * @param equipoGrande the equipoGrande to set
     */
    public void setEquipoGrande(String equipoGrande) {
        this.equipoGrande = equipoGrande;
    }

   
    
}
