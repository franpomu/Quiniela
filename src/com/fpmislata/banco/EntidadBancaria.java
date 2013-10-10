/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {
    
        private String IdEntidad;
        private String CodigoEntidad;
        private String Nombre;
        private String Cif;
        private TipoEntidadBancaria TipoEntidad;
        private List<SucursalBancaria> listaSucursal = new ArrayList();

        
    EntidadBancaria(String IdEntidad,String CodigoEntidad,String Nombre,String Cif,TipoEntidadBancaria TipoEntidad){
        this.IdEntidad=IdEntidad;
        this.CodigoEntidad=CodigoEntidad;
        this.Nombre=Nombre;
        this.Cif=Cif;
        this.TipoEntidad=TipoEntidad;
        
    }
    /**
     * @return the IdEntidad
     */
    public String getIdEntidad() {
        return IdEntidad;
    }

    /**
     * @param IdEntidad the IdEntidad to set
     */
    public void setIdEntidad(String IdEntidad) {
        this.IdEntidad = IdEntidad;
    }

    /**
     * @return the CodigoEntidad
     */
    public String getCodigoEntidad() {
        return CodigoEntidad;
    }

    /**
     * @param CodigoEntidad the CodigoEntidad to set
     */
    public void setCodigoEntidad(String CodigoEntidad) {
        this.CodigoEntidad = CodigoEntidad;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Cif
     */
    public String getCif() {
        return Cif;
    }

    /**
     * @param Cif the Cif to set
     */
    public void setCif(String Cif) {
        this.Cif = Cif;
    }

    /**
     * @return the TipoEntidad
     */
    public TipoEntidadBancaria getTipoEntidad() {
        return TipoEntidad;
    }

    /**
     * @param TipoEntidad the TipoEntidad to set
     */
    public void setTipoEntidad(TipoEntidadBancaria TipoEntidad) {
        this.TipoEntidad = TipoEntidad;
    }

    /**
     * @return the listaSucursal
     */
    public List<SucursalBancaria> getListaSucursal() {
        return listaSucursal;
    }

    /**
     * @param listaSucursal the listaSucursal to set
     */
    public void setListaSucursal(List<SucursalBancaria> listaSucursal) {
        this.listaSucursal = listaSucursal;
    }
        
}
