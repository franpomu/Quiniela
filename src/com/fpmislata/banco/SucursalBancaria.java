/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

/**
 *
 * @author alumno
 */
public class SucursalBancaria {
    private String IdSucursalBancaria;
    private String EntidadBancaria;
    private int CodigoSucursal;
    private String Nombre;

    
    SucursalBancaria(){
    this.IdSucursalBancaria=IdSucursalBancaria;
    this.EntidadBancaria=EntidadBancaria;
    this.CodigoSucursal=CodigoSucursal;
    this.Nombre=Nombre;
    }
    
    /**
     * @return the IdSucursalBancaria
     */
    public String getIdSucursalBancaria() {
        return IdSucursalBancaria;
    }

    /**
     * @param IdSucursalBancaria the IdSucursalBancaria to set
     */
    public void setIdSucursalBancaria(String IdSucursalBancaria) {
        this.IdSucursalBancaria = IdSucursalBancaria;
    }

    /**
     * @return the EntidadBancaria
     */
    public String getEntidadBancaria() {
        return EntidadBancaria;
    }

    /**
     * @param EntidadBancaria the EntidadBancaria to set
     */
    public void setEntidadBancaria(String EntidadBancaria) {
        this.EntidadBancaria = EntidadBancaria;
    }

    /**
     * @return the CodigoSucursal
     */
    public int getCodigoSucursal() {
        return CodigoSucursal;
    }

    /**
     * @param CodigoSucursal the CodigoSucursal to set
     */
    public void setCodigoSucursal(int CodigoSucursal) {
        this.CodigoSucursal = CodigoSucursal;
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
    
}
