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
    //Jugados
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    //Casa
    private int partidosJugadosCasa;
    private int partidosGanadosCasa;
    private int partidosPerdidosCasa;
    private int partidosEmpatadosCasa;
    //Fuera
    private int partidosJugadosFuera;
    private int partidosGanadosFuera;
    private int partidosPerdidosFuera;
    private int partidosEmpatadosFuera;
    //Goles
    private int goles;
    private int golesFavor;
    private int golesContra;
    //GolesCasa
    private int golesFavorCasa;
    private int golesContraCasa;
    //GolesFuera
    private int golesFavorFuera;
    private int golesContraFuera;

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
     * @return the partidosJugados
     */
    public int getPartidosJugados() {
        return partidosJugados;
    }

    /**
     * @param partidosJugados the partidosJugados to set
     */
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    /**
     * @return the partidosGanados
     */
    public int getPartidosGanados() {
        return partidosGanados;
    }

    /**
     * @param partidosGanados the partidosGanados to set
     */
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    /**
     * @return the partidosPerdidos
     */
    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    /**
     * @param partidosPerdidos the partidosPerdidos to set
     */
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    /**
     * @return the partidosEmpatados
     */
    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    /**
     * @param partidosEmpatados the partidosEmpatados to set
     */
    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    /**
     * @return the partidosJugadosCasa
     */
    public int getPartidosJugadosCasa() {
        return partidosJugadosCasa;
    }

    /**
     * @param partidosJugadosCasa the partidosJugadosCasa to set
     */
    public void setPartidosJugadosCasa(int partidosJugadosCasa) {
        this.partidosJugadosCasa = partidosJugadosCasa;
    }

    /**
     * @return the partidosGanadosCasa
     */
    public int getPartidosGanadosCasa() {
        return partidosGanadosCasa;
    }

    /**
     * @param partidosGanadosCasa the partidosGanadosCasa to set
     */
    public void setPartidosGanadosCasa(int partidosGanadosCasa) {
        this.partidosGanadosCasa = partidosGanadosCasa;
    }

    /**
     * @return the partidosPerdidosCasa
     */
    public int getPartidosPerdidosCasa() {
        return partidosPerdidosCasa;
    }

    /**
     * @param partidosPerdidosCasa the partidosPerdidosCasa to set
     */
    public void setPartidosPerdidosCasa(int partidosPerdidosCasa) {
        this.partidosPerdidosCasa = partidosPerdidosCasa;
    }

    /**
     * @return the partidosEmpatadosCasa
     */
    public int getPartidosEmpatadosCasa() {
        return partidosEmpatadosCasa;
    }

    /**
     * @param partidosEmpatadosCasa the partidosEmpatadosCasa to set
     */
    public void setPartidosEmpatadosCasa(int partidosEmpatadosCasa) {
        this.partidosEmpatadosCasa = partidosEmpatadosCasa;
    }

    /**
     * @return the partidosJugadosFuera
     */
    public int getPartidosJugadosFuera() {
        return partidosJugadosFuera;
    }

    /**
     * @param partidosJugadosFuera the partidosJugadosFuera to set
     */
    public void setPartidosJugadosFuera(int partidosJugadosFuera) {
        this.partidosJugadosFuera = partidosJugadosFuera;
    }

    /**
     * @return the partidosGanadosFuera
     */
    public int getPartidosGanadosFuera() {
        return partidosGanadosFuera;
    }

    /**
     * @param partidosGanadosFuera the partidosGanadosFuera to set
     */
    public void setPartidosGanadosFuera(int partidosGanadosFuera) {
        this.partidosGanadosFuera = partidosGanadosFuera;
    }

    /**
     * @return the partidosPerdidosFuera
     */
    public int getPartidosPerdidosFuera() {
        return partidosPerdidosFuera;
    }

    /**
     * @param partidosPerdidosFuera the partidosPerdidosFuera to set
     */
    public void setPartidosPerdidosFuera(int partidosPerdidosFuera) {
        this.partidosPerdidosFuera = partidosPerdidosFuera;
    }

    /**
     * @return the partidosEmpatadosFuera
     */
    public int getPartidosEmpatadosFuera() {
        return partidosEmpatadosFuera;
    }

    /**
     * @param partidosEmpatadosFuera the partidosEmpatadosFuera to set
     */
    public void setPartidosEmpatadosFuera(int partidosEmpatadosFuera) {
        this.partidosEmpatadosFuera = partidosEmpatadosFuera;
    }

    /**
     * @return the goles
     */
    public int getGoles() {
        return goles;
    }

    /**
     * @param goles the goles to set
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * @return the golesFavor
     */
    public int getGolesFavor() {
        return golesFavor;
    }

    /**
     * @param golesFavor the golesFavor to set
     */
    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    /**
     * @return the golesContra
     */
    public int getGolesContra() {
        return golesContra;
    }

    /**
     * @param golesContra the golesContra to set
     */
    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    /**
     * @return the golesFavorCasa
     */
    public int getGolesFavorCasa() {
        return golesFavorCasa;
    }

    /**
     * @param golesFavorCasa the golesFavorCasa to set
     */
    public void setGolesFavorCasa(int golesFavorCasa) {
        this.golesFavorCasa = golesFavorCasa;
    }

    /**
     * @return the golesContraCasa
     */
    public int getGolesContraCasa() {
        return golesContraCasa;
    }

    /**
     * @param golesContraCasa the golesContraCasa to set
     */
    public void setGolesContraCasa(int golesContraCasa) {
        this.golesContraCasa = golesContraCasa;
    }

    /**
     * @return the golesFavorFuera
     */
    public int getGolesFavorFuera() {
        return golesFavorFuera;
    }

    /**
     * @param golesFavorFuera the golesFavorFuera to set
     */
    public void setGolesFavorFuera(int golesFavorFuera) {
        this.golesFavorFuera = golesFavorFuera;
    }

    /**
     * @return the golesContraFuera
     */
    public int getGolesContraFuera() {
        return golesContraFuera;
    }

    /**
     * @param golesContraFuera the golesContraFuera to set
     */
    public void setGolesContraFuera(int golesContraFuera) {
        this.golesContraFuera = golesContraFuera;
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
    
        
}
