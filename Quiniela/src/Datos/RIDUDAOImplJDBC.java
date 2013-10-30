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
        String insertSQL = "INSERT INTO historico(idHistorico,idEquipoLocal,equipoLocal,golesLocal,idEquipoVisitante,equipoVisitante,golesVisitante,jornada) VALUES(?,?,?,?,?,?,?,?)";


        try {
            Connection conexion = connectionFactory.getConnection();
            PreparedStatement ps = conexion.prepareStatement(insertSQL);

            for (Jornada jornada : jornadaLeida) {
                ps.setNull(1, java.sql.Types.INTEGER);
                ps.setInt(2, jornada.getIdEquipoLocal());
                ps.setString(3, jornada.getEquipoLocal());
                ps.setDouble(4, jornada.getGolesLocal());
                ps.setInt(5, jornada.getIdEquipoVisitante());
                ps.setString(6, jornada.getEquipoVisitante());
                ps.setDouble(7, jornada.getGolesVisitante());
                ps.setInt(8, jornada.getJornada());
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
      
        
        String selectSQL="SELECT idEquipoLocal,equipoLocal,golesLocal,idEquipovisitante,equipoVisitante,golesVisitante FROM historico WHERE idEquipoLocal=? and idEquipoVisitante=?";
        List<Equipo> equipoList=new ArrayList();
        Equipo equipoLocal=null;
        Equipo equipoVisitante=null;
        try{
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(selectSQL);
            ps.setInt(1,idEquipoLocal);
            ps.setInt(2, idEquipoVisitante);
            ResultSet rs=ps.executeQuery();
                    
            while(rs.next()){
                equipoLocal=new Equipo();
                equipoVisitante=new Equipo();
                
                equipoLocal.setIdEquipo(idEquipoLocal);
                equipoLocal.setNombreEquipo(rs.getString("equipoLocal"));
                equipoLocal.setGoles(rs.getFloat("golesLocal"));
                equipoVisitante.setIdEquipo(idEquipoVisitante);
                equipoVisitante.setNombreEquipo(rs.getString("equipoVisitante"));
                equipoVisitante.setGoles(rs.getFloat("golesVisitante"));
                equipoList.add(equipoLocal);
                equipoList.add(equipoVisitante);
                
            }
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return equipoList;
    }

    @Override
    public void introducirResultado(Integer idEquipoLocal, Integer idEquipoVisitante) {

        String updateSQL = "UPDATE historico SET golesLocal=?,golesVisitante=? WHERE idEquipoLocal=? and idEquipoVisitante=?";
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
            PreparedStatement ps = conexion.prepareStatement(updateSQL);
            ps.setDouble(1, golesLocal);
            ps.setDouble(2, golesVisitante);
            ps.setInt(3, idEquipoLocal);
            ps.setInt(4, idEquipoVisitante);
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void introducirResultados() {

        List<Jornada> jornadaList = new ArrayList();
        String updateSQL="UPDATE historico SET golesLocal=?,golesVisitante=? where idEquipoLocal=? and idEquipoVisitante=?";
        
        jornadaList = leerJornada();
        Equipo equipoLocal = null;
        Equipo equipoVisitante = null;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Double golesLocal = 0.0;
        Double golesVisitante = 0.0;

        System.out.println("--------------------------");
        for (Jornada jornada : jornadaList) {
            
            equipoLocal = new Equipo();
            equipoVisitante = new Equipo();
            equipoLocal = leerEquipo(jornada.getIdEquipoLocal());
            equipoVisitante = leerEquipo(jornada.getIdEquipoVisitante());
            System.out.println(equipoLocal.getNombreEquipo() + "-" + equipoVisitante.getNombreEquipo());
        
            try {
                golesLocal = Double.valueOf(leer.readLine());
                golesVisitante = Double.valueOf(leer.readLine());
            } catch (IOException ex) {
                Logger.getLogger(RIDUDAOImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("--------------------------");
            
            try{
                Connection conexion=connectionFactory.getConnection();
                PreparedStatement ps=conexion.prepareStatement(updateSQL);
                ps.setDouble(1, golesLocal);
                ps.setDouble(2, golesVisitante);
                ps.setInt(3,jornada.getIdEquipoLocal());
                ps.setInt(4,jornada.getIdEquipoVisitante());
                ps.executeUpdate();
                conexion.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
