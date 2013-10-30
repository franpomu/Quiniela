/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Equipo;
import Negocio.Jornada;
import Negocio.TipoLiga;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iTo
 */
public class RIDUDAOImplJDBC implements RIDUDAO {

    ConnectionFactory connectionFactory = new ConnectionFactoryImplJDBC();

    @Override
    public Equipo leerEquipo(Integer idEquipo) {

        String selectSQL = "SELECT * FROM equipo WHERE idEquipo=?";
        Equipo equipo = null;

        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ps.setInt(1, idEquipo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                equipo = new Equipo();
                equipo.setIdEquipo(idEquipo);
                equipo.setNombreEquipo(rs.getString("nombreEquipo"));
                equipo.setFormaEquipo(rs.getInt("formaEquipo"));
                equipo.setTipoLiga(TipoLiga.valueOf(rs.getString("tipoLiga")));
                equipo.setPartidosJugados(rs.getInt("partidosJugados"));
                equipo.setPartidosGanados(rs.getInt("partidosGanados"));
                equipo.setPartidosPerdidos(rs.getInt("partidosPerdidos"));
                equipo.setPartidosEmpatados(rs.getInt("partidosEmpatados"));
                equipo.setPartidosJugadosCasa(rs.getInt("partidosJugadosCasa"));
                equipo.setPartidosGanadosCasa(rs.getInt("partidosGanadosCasa"));
                equipo.setPartidosPerdidosCasa(rs.getInt("partidosPerdidosCasa"));
                equipo.setPartidosEmpatadosCasa(rs.getInt("partidosEmpatadosCasa"));
                equipo.setPartidosJugadosFuera(rs.getInt("partidosJugadosFuera"));
                equipo.setPartidosGanadosFuera(rs.getInt("partidosGanadosFuera"));
                equipo.setPartidosPerdidosFuera(rs.getInt("partidosPerdidosFuera"));
                equipo.setPartidosEmpatadosFuera(rs.getInt("partidosEmpatadosFuera"));
                equipo.setGoles(rs.getInt("goles"));
                equipo.setGolesFavor(rs.getInt("golesFavor"));
                equipo.setGolesContra(rs.getInt("golesContra"));
                equipo.setGolesFavorCasa(rs.getInt("golesFavorCasa"));
                equipo.setGolesContraCasa(rs.getInt("golesContraCasa"));
                equipo.setGolesFavorFuera(rs.getInt("golesFavorFuera"));
                equipo.setGolesContraFuera(rs.getInt("golesContraFuera"));
                if (rs.next()) {
                    throw new RuntimeException();
                }

                conexion.close();
            }

        } catch (SQLException e) {
            System.out.println("No se han leido los datos");
        }
        return equipo;
    }

    @Override
    public void mostrarEquipo(Equipo equipo) {
        System.out.println("Id Equipo:" + equipo.getIdEquipo());
        System.out.println("Nombre Equipo:" + equipo.getNombreEquipo());
        System.out.println("Forma Equipo:" + equipo.getFormaEquipo());
        System.out.println("Tipo Liga:" + equipo.getTipoLiga());
        System.out.println("Partidos Jugado:" + equipo.getPartidosJugados());
        System.out.println("Partidos Ganados:" + equipo.getPartidosGanados());
        System.out.println("Partidos Perdidos:" + equipo.getPartidosPerdidos());
        System.out.println("Partidos Empatados:" + equipo.getPartidosEmpatados());
        System.out.println("Partidos Jugados en Casa:" + equipo.getPartidosJugadosCasa());
        System.out.println("Partidos Ganados en Casa:" + equipo.getPartidosGanadosCasa());
        System.out.println("Partidos Perdidos en Casa:" + equipo.getPartidosPerdidosCasa());
        System.out.println("Partidos Empatados en Casa:" + equipo.getPartidosEmpatadosCasa());
        System.out.println("Partidos Jugados Fuera de Casa:" + equipo.getPartidosJugadosFuera());
        System.out.println("Partidos Ganados Fuera de Casa:" + equipo.getPartidosGanadosFuera());
        System.out.println("Partidos Perdidos Fuera de Casa:" + equipo.getPartidosPerdidosFuera());
        System.out.println("Partidos Empatados Fuera de Casa:" + equipo.getPartidosEmpatadosFuera());
        System.out.println("Goles:" + equipo.getGoles());
        System.out.println("Goles a Favor:" + equipo.getGolesFavor());
        System.out.println("Goles en Contra:" + equipo.getGolesContra());
        System.out.println("Goles a Favor en Casa:" + equipo.getGolesFavorCasa());
        System.out.println("Goles en Contra en Casa:" + equipo.getGolesContraCasa());
        System.out.println("Goles a Favor Fuera;" + equipo.getGolesFavorFuera());
        System.out.println("Goles en Contra Fuera:" + equipo.getGolesContraFuera());
    }

    @Override
    public List<Jornada> leerJornada() {

        List<Jornada> jornadaLista = new ArrayList();
        Jornada jornada = null;
        String selectSQL = "SELECT idJornada,idEquipoLocal,equipoLocal,idEquipoVisitante,equipoVisitante,jornada FROM jornada";

        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(selectSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jornada = new Jornada();
                jornada.setIdJornada(rs.getInt("idJornada"));
                jornada.setIdEquipoLocal(rs.getInt("idEquipoLocal"));
                jornada.setEquipoLocal(rs.getString("equipoLocal"));
                jornada.setIdEquipoVisitante(rs.getInt("idEquipoVisitante"));
                jornada.setEquipoVisitante(rs.getString("equipoVisitante"));
                jornada.setJornada(rs.getInt("jornada"));
                jornadaLista.add(jornada);
            }
            conexion.close();
        } catch (SQLException e) {
        }
        return jornadaLista;
    }

    @Override
    public void escribirHistorico() {


        List<Jornada> jornadaLeida = leerJornada();
        String insertSQL = "INSERT INTO historico(idHistorico,idJornada,idEquipoLocal,equipoLocal,golesLocal,idEquipoVisitante,equipoVisitante,golesVisitante,jornada,anyo) VALUES(?,?,?,?,?,?,?,?,?,?)";


        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(insertSQL);

            for (Jornada jornada : jornadaLeida) {
                ps.setNull(1, java.sql.Types.INTEGER);
                ps.setInt(2, jornada.getIdJornada());
                ps.setInt(3, jornada.getIdEquipoLocal());
                ps.setString(4, jornada.getEquipoLocal());
                ps.setDouble(5, jornada.getGolesLocal());
                ps.setInt(6, jornada.getIdEquipoVisitante());
                ps.setString(7, jornada.getEquipoVisitante());
                ps.setDouble(8, jornada.getGolesVisitante());
                ps.setInt(9, jornada.getJornada());
                ps.setInt(10, 2013);
                ps.executeUpdate();
            }
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR" + e);
        }


    }

    @Override
    public List<Equipo> historicoResultados(Integer idEquipoLocal, Integer idEquipoVisitante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


    }

    @Override
    public void introducirResultado(Integer idEquipoLocal, Integer idEquipoVisitante) {

        String insertSQL = "UPDATE historico SET golesLocal=?,golesVisitante=? WHERE idEquipoLocal=? and idEquipoVisitante=?";
        Equipo equipoLocal = leerEquipo(idEquipoLocal);
        Equipo equipoVisitante = leerEquipo(idEquipoVisitante);
        Double golesLocal = 0.0;
        Double golesVisitante = 0.0;

        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(equipoLocal.getNombreEquipo() + "-" + equipoVisitante.getNombreEquipo());
            golesLocal = Double.valueOf(leer.readLine());
            golesVisitante = Double.valueOf(leer.readLine());
            System.out.println(equipoLocal.getNombreEquipo() + ":" + golesLocal + " - " + equipoVisitante.getNombreEquipo() + ":" + golesVisitante);
        } catch (IOException ex) {
            Logger.getLogger(RIDUDAOImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setDouble(1, golesLocal);
            ps.setDouble(2, golesVisitante);
            ps.setInt(3, idEquipoLocal);
            ps.setInt(4, idEquipoVisitante);
            ps.executeUpdate();
        } catch (SQLException e) {
        }


    }
}
