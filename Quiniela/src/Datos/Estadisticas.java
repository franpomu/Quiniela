/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Equipo;


/**
 *
 * @author iTo
 */
public class Estadisticas {
    
    RIDUDAO ridudao=new RIDUDAOImplJDBC();
    
    
     public double redondear( double numero, int decimales ) {
        return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
    }
     
     
    public double porcentajeGanado(Equipo equipo){
        double ganados;
        ganados=100*(equipo.getPartidosGanados()/equipo.getPartidosJugados()); 
        ganados=redondear(ganados,2);
        return ganados;
    }
    
    public double porcentajeEmpatado(Equipo equipo){
        double empatados;
        empatados=100*(equipo.getPartidosEmpatados()/equipo.getPartidosJugados()); 
        empatados=redondear(empatados,2);
        return empatados;
    }
    
    public double porcentajePerdido(Equipo equipo){
        double perdidos;
        perdidos=100*(equipo.getPartidosPerdidos()/equipo.getPartidosJugados()); 
        perdidos=redondear(perdidos,2);
        return perdidos;
    }
    
    public double porcentajeGanadoCasa(Equipo equipo){
        double ganados;
        ganados=100*(equipo.getPartidosGanadosCasa()/equipo.getPartidosJugadosCasa());
        ganados=redondear(ganados,2);
        return ganados;
    }
    
    public double porcentajeEmpatadoCasa(Equipo equipo){
        double empatados;
        empatados=100*(equipo.getPartidosEmpatadosCasa()/equipo.getPartidosJugadosCasa()); 
        empatados=redondear(empatados,2);
        return empatados;
    }
    
    public double porcentajePerdidoCasa(Equipo equipo){
        double perdidos;
        perdidos=100*(equipo.getPartidosPerdidosCasa()/equipo.getPartidosJugadosCasa()); 
        perdidos=redondear(perdidos,2);
        return perdidos;
    }
    
    public double porcentajeGanadoFuera(Equipo equipo){
        double ganados;
        ganados=100*(equipo.getPartidosGanadosFuera()/equipo.getPartidosJugadosFuera());
        ganados=redondear(ganados,2);
        return ganados;
        
    }
    
    public double porcentajeEmpatadoFuera(Equipo equipo){
        double empatados;
        empatados=100*(equipo.getPartidosEmpatadosFuera()/equipo.getPartidosJugadosFuera()); 
        empatados=redondear(empatados,2);
        return empatados;
    }
    
    public double porcentajePerdidoFuera(Equipo equipo){
        double perdidos;
        perdidos=100*(equipo.getPartidosPerdidosFuera()/equipo.getPartidosJugadosFuera()); 
        perdidos=redondear(perdidos,2);
        return perdidos;
    }
}
