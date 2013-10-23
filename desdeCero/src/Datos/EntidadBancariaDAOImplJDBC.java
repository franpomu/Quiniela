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
import java.util.ArrayList;
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
        String selectSQL="SELECT idEntidad,codigoEntidad,nombre,cif,tipoEntidadBancaria FROM entidadbancaria WHERE idEntidad = ?";
        
            try{
                Connection conexion=connectionFactory.getConnection();
                PreparedStatement ps=conexion.prepareStatement(selectSQL);
                ps.setInt(1,idEntidad);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    entidadBancaria=new EntidadBancaria();
                    entidadBancaria.setIdEntidad(idEntidad);
                    entidadBancaria.setCodigoEntidad(rs.getString("codigoEntidad"));
                    entidadBancaria.setNombre(rs.getString("nombre"));
                    entidadBancaria.setCif(rs.getString("cif"));
                    entidadBancaria.setTipoEntidad((TipoEntidadBancaria.valueOf(rs.getString("tipoEntidadBancaria"))));
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
    public void delete(Integer idEntidad) {
        
        String deleteSQL="DELETE FROM entidadbancaria WHERE idEntidad=?";
        
        try{
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(deleteSQL);
            ps.setInt(1, idEntidad);
            ps.executeUpdate();
            conexion.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(EntidadBancaria entidadBancaria) {
      
        String updateSQL="UPDATE entidadbancaria SET  codigoEntidad = ?, nombre = ?, cif = ?, tipoEntidadBancaria = ? WHERE idEntidad = ?";
        
        try{
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(updateSQL);
            ps.setString(1,entidadBancaria.getCodigoEntidad());
            ps.setString(2,entidadBancaria.getNombre());
            ps.setString(3,entidadBancaria.getCif());
            ps.setString(4,entidadBancaria.getTipoEntidad().toString());
            ps.setInt(5,entidadBancaria.getIdEntidad());
            ps.executeUpdate();
            conexion.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<EntidadBancaria> findAll() {
        
        
        String selectSQL="SELECT idEntidad,codigoEntidad,nombre,cif,tipoEntidadBancaria FROM entidadbancaria";
        
        try{
            List<EntidadBancaria> entidadesBancarias=new ArrayList();
            Connection conexion=connectionFactory.getConnection();
            PreparedStatement ps=conexion.prepareStatement(selectSQL);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                EntidadBancaria entidadBancaria=new EntidadBancaria();
                entidadBancaria.setIdEntidad(rs.getInt("idEntidad"));
                entidadBancaria.setCodigoEntidad(rs.getString("codigoEntidad"));
                entidadBancaria.setNombre(rs.getString("nombre"));
                entidadBancaria.setCif(rs.getString("cif"));
                entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(rs.getString("tipoEntidadBancaria")));
                entidadesBancarias.add(entidadBancaria);
                             
            }
            
            conexion.close();
            return entidadesBancarias;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
     
        
    }

    @Override
    public List<EntidadBancaria> findByName(String nombreEntidad) {
        
        List<EntidadBancaria> entidadesBancarias=new ArrayList();
        Connection conexion=connectionFactory.getConnection();
        
        try{
            PreparedStatement ps;
            String selectSQL;
            if(nombreEntidad == null || nombreEntidad.trim().isEmpty()){
                selectSQL="SELECT * FROM entidadbancaria";
                ps=conexion.prepareStatement(selectSQL);
                }else{
                    selectSQL="SELECT * FROM entidadbancaria WHERE nombre LIKE ?";
                    ps=conexion.prepareStatement(selectSQL);
                    ps.setString(1,nombreEntidad);
            }
            
            ResultSet rs=ps.executeQuery();
           
            while(rs.next()){
                EntidadBancaria entidadBancaria=new EntidadBancaria();
                entidadBancaria.setIdEntidad(rs.getInt("idEntidad"));
                entidadBancaria.setCodigoEntidad(rs.getString("codigoEntidad"));
                entidadBancaria.setNombre(rs.getString("nombre"));
                entidadBancaria.setCif(rs.getString("cif"));
                entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(rs.getString("tipoEntidadBancaria")));
                entidadesBancarias.add(entidadBancaria);
                             
            }
            
            conexion.close();
            return entidadesBancarias;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<EntidadBancaria> findByCodigo(String codigoEntidad) {
        
        List<EntidadBancaria> entidadesBancarias=new ArrayList();
        Connection conexion=connectionFactory.getConnection();
        
        try{
            PreparedStatement ps;
            String selectSQL;
            if(codigoEntidad == null || codigoEntidad.trim().isEmpty()){
                selectSQL="SELECT * FROM entidadbancaria";
                ps=conexion.prepareStatement(selectSQL);
                }else{
                    selectSQL="SELECT * FROM entidadbancaria WHERE codigoEntidad LIKE ?";
                    ps=conexion.prepareStatement(selectSQL);
                    ps.setString(1,codigoEntidad);
            }
            
            ResultSet rs=ps.executeQuery();
           
            while(rs.next()){
                EntidadBancaria entidadBancaria=new EntidadBancaria();
                entidadBancaria.setIdEntidad(rs.getInt("idEntidad"));
                entidadBancaria.setCodigoEntidad(rs.getString("codigoEntidad"));
                entidadBancaria.setNombre(rs.getString("nombre"));
                entidadBancaria.setCif(rs.getString("cif"));
                entidadBancaria.setTipoEntidad(TipoEntidadBancaria.valueOf(rs.getString("tipoEntidadBancaria")));
                entidadesBancarias.add(entidadBancaria);
                             
            }
            
            conexion.close();
            return entidadesBancarias;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    
}
