/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author iTo
 */
public class ConnectionFactoryImplJDBC implements ConnectionFactory{

    @Override
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.print("No se encontro diver mysql");
            e.printStackTrace();
        }
        Connection conexion=null;
        try{
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root", "159753");
        }catch(SQLException e){
            System.out.print("Fallo en la conexion");
            e.printStackTrace();
        }
        
        if(conexion != null){
            System.out.print("Conexion realizada con exito");
        }else{
            System.out.print("Conexion fallida");
        }
        
        return conexion;
    }

    @Override
    public void closeConnection(Connection conexion) {
        
        try{
            conexion.close();
        }catch(SQLException e){
            System.out.print("No se ha cerrado la conexion");
            e.printStackTrace();
        }
    }
    
}
