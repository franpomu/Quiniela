/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Equipo;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author iTo
 */
public interface ConnectionFactory {

    public Connection getConnection();

    public void closeConnection(Connection conexion);
}
