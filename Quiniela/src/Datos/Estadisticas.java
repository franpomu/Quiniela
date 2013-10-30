/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Equipo;
import Negocio.Jornada;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iTo
 */
public class Estadisticas {

    public double redondear(double numero, int decimales) {
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }

    public double porcentajeGanado(Equipo equipo) {
        double ganados;
        ganados = 100 * (equipo.getPartidosGanados() / equipo.getPartidosJugados());
        ganados = redondear(ganados, 2);
        return ganados;
    }

    public double porcentajeEmpatado(Equipo equipo) {
        double empatados;
        empatados = 100 * (equipo.getPartidosEmpatados() / equipo.getPartidosJugados());
        empatados = redondear(empatados, 2);
        return empatados;
    }

    public double porcentajePerdido(Equipo equipo) {
        double perdidos;
        perdidos = 100 * (equipo.getPartidosPerdidos() / equipo.getPartidosJugados());
        perdidos = redondear(perdidos, 2);
        return perdidos;
    }

    public double porcentajeGanadoCasa(Equipo equipo) {
        double ganados;
        ganados = 100 * (equipo.getPartidosGanadosCasa() / equipo.getPartidosJugadosCasa());
        ganados = redondear(ganados, 2);
        return ganados;
    }

    public double porcentajeEmpatadoCasa(Equipo equipo) {
        double empatados;
        empatados = 100 * (equipo.getPartidosEmpatadosCasa() / equipo.getPartidosJugadosCasa());
        empatados = redondear(empatados, 2);
        return empatados;
    }

    public double porcentajePerdidoCasa(Equipo equipo) {
        double perdidos;
        perdidos = 100 * (equipo.getPartidosPerdidosCasa() / equipo.getPartidosJugadosCasa());
        perdidos = redondear(perdidos, 2);
        return perdidos;
    }

    public double porcentajeGanadoFuera(Equipo equipo) {
        double ganados;
        ganados = 100 * (equipo.getPartidosGanadosFuera() / equipo.getPartidosJugadosFuera());
        ganados = redondear(ganados, 2);
        return ganados;

    }

    public double porcentajeEmpatadoFuera(Equipo equipo) {
        double empatados;
        empatados = 100 * (equipo.getPartidosEmpatadosFuera() / equipo.getPartidosJugadosFuera());
        empatados = redondear(empatados, 2);
        return empatados;
    }

    public double porcentajePerdidoFuera(Equipo equipo) {
        double perdidos;
        perdidos = 100 * (equipo.getPartidosPerdidosFuera() / equipo.getPartidosJugadosFuera());
        perdidos = redondear(perdidos, 2);
        return perdidos;
    }

    public void mostrarJornada() {

        RIDUDAO ridudao = new RIDUDAOImplJDBC();
        List<Jornada> jornadaLeida = ridudao.leerJornada();

        System.out.println("------------------------------------------------");
        for (Jornada jornada : jornadaLeida) {
            System.out.println("IdJornada:" + jornada.getIdJornada());
            System.out.println("Jornada:" + jornada.getJornada());
            System.out.println("EquipoLocal:" + jornada.getEquipoLocal());
            System.out.println("EquipoVisitante:" + jornada.getEquipoVisitante());
            System.out.println("------------------------------------------------");

        }
    }

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
    
    public void mostrarHistorico(Integer idEquipo1,Integer idEquipo2){
        
        List<Equipo> equipoList=new ArrayList();
        RIDUDAO ridudao=new RIDUDAOImplJDBC();
        
        equipoList=ridudao.historicoResultados(idEquipo1,idEquipo2);
        for(Equipo equipofor:equipoList){
           System.out.println(equipofor.getNombreEquipo()+": "+equipofor.getGoles());
        }
        equipoList=ridudao.historicoResultados(idEquipo2,idEquipo1);
        for(Equipo equipofor:equipoList){
            System.out.println(equipofor.getNombreEquipo()+": "+equipofor.getGoles());
        }
    }

    public void pronostico() {
        
        RIDUDAO ridudao=new RIDUDAOImplJDBC();
        List<Jornada> jornadaLista=new ArrayList();
        jornadaLista=ridudao.leerJornada();
        Equipo equipoLocal=null;
        Equipo equipoVisitante=null;
       
       for(Jornada jornada:jornadaLista){
           //leer equipo
           equipoLocal=new Equipo();
           equipoVisitante=new Equipo();
           equipoLocal=ridudao.leerEquipo(jornada.getIdEquipoLocal());
           equipoVisitante=ridudao.leerEquipo(jornada.getIdEquipoVisitante());
           
           //pronosticar equipo
           if(equipoLocal.getEquipoGrande() == "si" && equipoVisitante.getEquipoGrande() == "no"){
               
           }
           
           
       }
    }
}
