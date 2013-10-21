/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.EntidadBancaria;
import Negocio.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author iTo
 */
public class EntidadBancariaDAOImplJDBC implements EntidadBancariaDAO{

    ConnectionFactory connectionFactory= new ConnectionFactoryImplJDBC();
    
    @Override
    public EntidadBancaria read(Integer idEntidad) {
            
        EntidadBancaria entidadBancaria=null;
        String selectSQL="SELECT * FROM entidadbancaria WHERE idEntidad=?";
        
            try{
                
                Connection conexion=connectionFactory.getConnection();
                PreparedStatement ps=conexion.prepareStatement(selectSQL);
                ps.setInt(1, idEntidad);
                ResultSet rs=ps.executeQuery(selectSQL);
                
                if(rs.next()){
                    entidadBancaria=new EntidadBancaria();
                    entidadBancaria.setIdEntidad(idEntidad);
                    entidadBancaria.setCodigoEntidad(rs.getString("codigoentidad"));
                    entidadBancaria.setNombre(rs.getString("nombre"));
                    entidadBancaria.setCif(rs.getString("cif"));
                    entidadBancaria.setTipoEntidad((TipoEntidadBancaria.valueOf(rs.getString("tipoentidadbancaria"))));
                    if(rs.next()) throw new RuntimeException();
                    
                    conexion.close();
                }
            }catch(SQLException e){
                throw new RuntimeException(e);
            }
           
            return entidadBancaria;
            
    }

    @Override
    public void insert(EntidadBancaria entidadBancaria) {
        
        String insertSQL="INSERT INTO entidadBancaria(idEntidad, codigoEntidad, nombre, cif, tipoEntidadBancaria) VALUES (?,?,?,?,?)";
        
        try{
            
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(insertSQL);
            ps.setInt(1,entidadBancaria.getIdEntidad());
            ps.setString(2,entidadBancaria.getCodigoEntidad());
            ps.setString(3,entidadBancaria.getNombre());
            ps.setString(4,entidadBancaria.getCif());
            ps.setString(5,entidadBancaria.getTipoEntidad().toString());
            ps.executeUpdate();
            conexion.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(EntidadBancaria entidadBancaria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EntidadBancaria> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
