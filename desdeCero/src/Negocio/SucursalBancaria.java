/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iTo
 */
public class SucursalBancaria {
    
    private Integer idSucursal;
    private String entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    private List<CuentaBancaria> entidadesBancarias = new ArrayList();
    
    public SucursalBancaria(){
        this.idSucursal=null;
        this.entidadBancaria=null;
        this.codigoSucursal=null;
        this.nombre=null;
    }
    
    public SucursalBancaria(Integer idSucursal,String entidadBancaria, String codigoSucursal, String nombre){
        
        this.idSucursal=null;
        this.entidadBancaria=null;
        this.codigoSucursal=null;
        this.nombre=null;
        
    }

    /**
     * @return the idSucursal
     */
    public Integer getIdSucursal() {
        return idSucursal;
    }

    /**
     * @param idSucursal the idSucursal to set
     */
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    /**
     * @return the entidadBancaria
     */
    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    /**
     * @param entidadBancaria the entidadBancaria to set
     */
    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    /**
     * @return the codigoSucursal
     */
    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * @param codigoSucursal the codigoSucursal to set
     */
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
