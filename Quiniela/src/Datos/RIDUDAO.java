/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Equipo;
import Negocio.Jornada;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author iTo
 */
public interface RIDUDAO {

    public Equipo leerEquipo(Integer idEquipo);

    public void escribirHistorico();
    //El equipo 1 sera el que esta emparejado con el equipo 2

    public List<Jornada> leerJornada();

    public List<Equipo> historicoResultados(Integer idEquipoLocal, Integer idEquipoVisitante);

    public void introducirResultado(Integer idEquipoLocal, Integer idEquipoVisitante);
    
    public void introducirResultados();
}
