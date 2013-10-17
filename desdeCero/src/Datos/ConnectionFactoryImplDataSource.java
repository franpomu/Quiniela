/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author iTo
 */
public class ConnectionFactoryImplDataSource implements ConnectionFactory{

    @Override
    public Connection getConnection() {
        Connection conexion=null;
        try{
            InitialContext initCtx=new InitialContext();;
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            DataSource ds = (DataSource)envCtx.lookup("jdbc/banco");
            conexion=ds.getConnection();
        
        }catch(Exception e){
           throw new RuntimeException();
        }
        
        return conexion;
    }

    @Override
    public void closeConnection(Connection conexion) {
        
        try{
            conexion.close();
        }catch(Exception e){
            throw new RuntimeException();
        }
    }
    
}
