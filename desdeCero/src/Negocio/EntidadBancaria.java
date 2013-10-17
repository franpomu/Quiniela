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
public class EntidadBancaria {
 
    private Integer idEntidad;
    private String codigoEntidad;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidad;
    private List<SucursalBancaria> sucursalesBancarias= new ArrayList();
    
    
    public EntidadBancaria(){
        this.idEntidad=null;
        this.codigoEntidad=null;
        this.nombre=null;
        this.cif=null;
        this.tipoEntidad=null;
        
    }
    
    public EntidadBancaria(Integer idEntidad,String codigoEntidad,String nombre,String cif,TipoEntidadBancaria tipoEntidad){
    
        this.idEntidad=idEntidad;
        this.codigoEntidad=codigoEntidad;
        this.nombre=nombre;
        this.cif=cif;
        this.tipoEntidad=tipoEntidad;
    }

    /**
     * @return the idEntidad
     */
    public Integer getIdEntidad() {
        return idEntidad;
    }

    /**
     * @param idEntidad the idEntidad to set
     */
    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    /**
     * @return the codigoEntidad
     */
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * @param codigoEntidad the codigoEntidad to set
     */
    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
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

    /**
     * @return the cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the cif to set
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * @return the tipoEntidad
     */
    public TipoEntidadBancaria getTipoEntidad() {
        return tipoEntidad;
    }

    /**
     * @param tipoEntidad the tipoEntidad to set
     */
    public void setTipoEntidad(TipoEntidadBancaria tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }
    
    
}
