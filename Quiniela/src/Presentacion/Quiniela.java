/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

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
            
        Equipo equipo=new Equipo();
        
            equipo=ridudao.leerEquipo(1);
            ridudao.mostrarEquipo(equipo);
    }
}
