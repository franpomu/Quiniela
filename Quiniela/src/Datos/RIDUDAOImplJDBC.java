/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Equipo;
import Negocio.Jornada;
import Negocio.TipoLiga;
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

/**
 *
 * @author iTo
 */
public class RIDUDAOImplJDBC implements RIDUDAO{

    ConnectionFactory connectionFactory=new ConnectionFactoryImplJDBC();
    

    @Override
    public Equipo leerEquipo(Integer idEquipo) {
        
        String selectSQL="SELECT * FROM equipo WHERE idEquipo=?";
        Equipo equipo=null;
        
        try{
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(selectSQL);
            ps.setInt(1,idEquipo);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                equipo=new Equipo();
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
                if(rs.next()) throw new RuntimeException();
                
                conexion.close();
            }
        
        }catch(SQLException e){
            System.out.println("No se han leido los datos");
        }
        return equipo;
    }

    @Override
    public void mostrarEquipo(Equipo equipo) {
        System.out.println("Id Equipo:"+equipo.getIdEquipo());
        System.out.println("Nombre Equipo:"+equipo.getNombreEquipo());
        System.out.println("Forma Equipo:"+equipo.getFormaEquipo());
        System.out.println("Tipo Liga:"+equipo.getTipoLiga());
        System.out.println("Partidos Jugado:"+equipo.getPartidosJugados());
        System.out.println("Partidos Ganados:"+equipo.getPartidosGanados());
        System.out.println("Partidos Perdidos:"+equipo.getPartidosPerdidos());
        System.out.println("Partidos Empatados:"+equipo.getPartidosEmpatados());
        System.out.println("Partidos Jugados en Casa:"+equipo.getPartidosJugadosCasa());
        System.out.println("Partidos Ganados en Casa:"+equipo.getPartidosGanadosCasa());
        System.out.println("Partidos Perdidos en Casa:"+equipo.getPartidosPerdidosCasa());
        System.out.println("Partidos Empatados en Casa:"+equipo.getPartidosEmpatadosCasa());
        System.out.println("Partidos Jugados Fuera de Casa:"+equipo.getPartidosJugadosFuera());
        System.out.println("Partidos Ganados Fuera de Casa:"+equipo.getPartidosGanadosFuera());
        System.out.println("Partidos Perdidos Fuera de Casa:"+equipo.getPartidosPerdidosFuera());
        System.out.println("Partidos Empatados Fuera de Casa:"+equipo.getPartidosEmpatadosFuera());
        System.out.println("Goles:"+equipo.getGoles());
        System.out.println("Goles a Favor:"+equipo.getGolesFavor());
        System.out.println("Goles en Contra:"+equipo.getGolesContra());
        System.out.println("Goles a Favor en Casa:"+equipo.getGolesFavorCasa());
        System.out.println("Goles en Contra en Casa:"+equipo.getGolesContraCasa());
        System.out.println("Goles a Favor Fuera;"+equipo.getGolesFavorFuera());
        System.out.println("Goles en Contra Fuera:"+equipo.getGolesContraFuera());
    }

    @Override
    public List<Jornada> leerJornada() {
        
        List<Jornada> jornadaLista=new ArrayList();
        Jornada jornada=null;
        String selectSQL="SELECT idJornada,equipoLocal,equipoVisitante,jornada FROM jornada";
        
        try{
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(selectSQL);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                jornada=new Jornada();
                jornada.setIdJornada(rs.getInt("idJornada"));
                jornada.setEquipoLocal(rs.getString("equipoLocal"));
                jornada.setEquipoVisitante(rs.getString("equipoVisitante"));
                jornada.setJornada(rs.getInt("jornada"));
                jornadaLista.add(jornada);
            }
            conexion.close();
        }catch(SQLException e){
        }
        return jornadaLista;
    }

    @Override
    public void mostrarJornada() {
        
        List<Jornada> jornadaLeida=leerJornada();
        System.out.println("------------------------------------------------");
        for(Jornada jornada:jornadaLeida){
                System.out.println("IdJornada:"+jornada.getIdJornada());
                System.out.println("Jornada:"+jornada.getJornada());
                System.out.println("EquipoLocal:"+jornada.getEquipoLocal());
                System.out.println("EquipoVisitante:"+jornada.getEquipoVisitante());
                System.out.println("------------------------------------------------");
                
              }
    }

    @Override
    public void escribirHistorico() {
        

        List<Jornada> jornadaLeida=leerJornada();
        String insertSQL="INSERT INTO historico(idHistorico,idJornada,equipoLocal,equipoVisitante,jornada,anyo) VALUES(?,?,?,?,?,?)";
        
        
           try{
              Connection conexion=connectionFactory.getConnection();
              PreparedStatement ps=conexion.prepareStatement(insertSQL);
              
              for(Jornada jornada:jornadaLeida){
                ps.setNull(1,java.sql.Types.INTEGER);
                ps.setInt(2,jornada.getIdJornada());
                ps.setString(3,jornada.getEquipoLocal());
                ps.setString(4,jornada.getEquipoVisitante());
                ps.setInt(5,jornada.getJornada());
                ps.setInt(6,2013);
                ps.executeUpdate();
              }
              conexion.close();
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("ERROR"+e);
            }
           
        
    }

   
    
}
