    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iTo
 */
public class CuentaBancaria {
    
    private Integer idCuentaBancaria;
    private String sucursalBancaria;
    private String numeroCuenta;
    private String dc;
    private BigDecimal saldo;
    private String cif;
    private List<MovimientoBancario> movimientosBancarios = new ArrayList();
    
    public CuentaBancaria(){
        this.idCuentaBancaria=null;
        this.sucursalBancaria=null;
        this.numeroCuenta=null;
        this.dc=null;
        this.saldo=null;
        this.cif=null;
    }
    public CuentaBancaria(Integer idCuentaBancaria,String sucursalBancaria,String numeroCuenta,String dc,BigDecimal saldo, String cif){
        this.idCuentaBancaria=idCuentaBancaria;
        this.sucursalBancaria=sucursalBancaria;
        this.numeroCuenta=numeroCuenta;
        this.dc=dc;
        this.saldo=saldo;
        this.cif=cif;
    }

    /**
     * @return the idCuentaBancaria
     */
    public Integer getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    /**
     * @param idCuentaBancaria the idCuentaBancaria to set
     */
    public void setIdCuentaBancaria(Integer idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    /**
     * @return the sucursalBancaria
     */
    public String getSucursalBancaria() {
        return sucursalBancaria;
    }

    /**
     * @param sucursalBancaria the sucursalBancaria to set
     */
    public void setSucursalBancaria(String sucursalBancaria) {
        this.sucursalBancaria = sucursalBancaria;
    }

    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the dc
     */
    public String getDc() {
        return dc;
    }

    /**
     * @param dc the dc to set
     */
    public void setDc(String dc) {
        this.dc = dc;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
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
     * @return the movimientosBancarios
     */
    public List<MovimientoBancario> getMovimientosBancarios() {
        return movimientosBancarios;
    }

    /**
     * @param movimientosBancarios the movimientosBancarios to set
     */
    public void setMovimientosBancarios(List<MovimientoBancario> movimientosBancarios) {
        this.movimientosBancarios = movimientosBancarios;
    }
    
}
