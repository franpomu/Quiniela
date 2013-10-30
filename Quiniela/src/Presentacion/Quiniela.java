/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Estadisticas;
import Datos.RIDUDAO;
import Datos.RIDUDAOImplJDBC;
import Negocio.Equipo;

/**
 *
 * @author iTo
 */
public class Quiniela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            RIDUDAO ridudao=new RIDUDAOImplJDBC();
            Estadisticas estadistica=new Estadisticas();
            
        Equipo equipo=new Equipo();
        
            equipo=ridudao.leerEquipo(1);
            double ganados=estadistica.porcentajeGanado(equipo);
            System.out.println("Ganados:"+ganados+"%");
            double perdidos=estadistica.porcentajePerdido(equipo);
            System.out.println("Perdidos:"+perdidos+"%");
            double empatados=estadistica.porcentajeEmpatado(equipo);
            System.out.println("Empatados:"+empatados+"%");
            double ganadoscasa=estadistica.porcentajeGanadoCasa(equipo);
            System.out.println("Ganadoscasa:"+ganadoscasa+"%");
            double perdidoscasa=estadistica.porcentajePerdidoCasa(equipo);
            System.out.println("Perdidoscasa:"+perdidoscasa+"%");
            double empatadoscasa=estadistica.porcentajeEmpatadoCasa(equipo);
            System.out.println("Empatadoscasa:"+empatadoscasa+"%");
            double ganadosfuera=estadistica.porcentajeGanadoFuera(equipo);
            System.out.println("Ganadosfuera:"+ganadosfuera+"%");
            double perdidosfuera=estadistica.porcentajePerdidoFuera(equipo);
            System.out.println("Perdidosfuera:"+perdidosfuera+"%");
            double empatadosfuera=estadistica.porcentajeEmpatadoFuera(equipo);
            System.out.println("Empatadosfuera:"+empatadosfuera+"%");
            
    }
}
