/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author iTo
 */
public class MovimientoBancario {
    
    private Integer idMovimientoBancario;
    private TipoMovimientoBancario tipoMovimiento;
    private BigDecimal importe;
    private Date fecha;
    private BigDecimal saldoTotal;
    private String concepto;
    
    public MovimientoBancario(){
        this.idMovimientoBancario=null;
        this.tipoMovimiento=null;
        this.importe=null;
        this.fecha=null;
        this.saldoTotal=null;
        this.concepto=null;
    }
    
    
    public MovimientoBancario(Integer idMovimientoBancario,TipoMovimientoBancario tipoMovimiento, BigDecimal importe, Date fecha,BigDecimal saldoTotal,String concepto){
   
        this.idMovimientoBancario=idMovimientoBancario;
        this.tipoMovimiento=tipoMovimiento;
        this.importe=importe;
        this.fecha=fecha;
        this.saldoTotal=saldoTotal;
        this.concepto=concepto;
        
    }

    /**
     * @return the idMovimientoBancario
     */
    public Integer getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    /**
     * @param idMovimientoBancario the idMovimientoBancario to set
     */
    public void setIdMovimientoBancario(Integer idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    /**
     * @return the tipoMovimiento
     */
    public TipoMovimientoBancario getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * @param tipoMovimiento the tipoMovimiento to set
     */
    public void setTipoMovimiento(TipoMovimientoBancario tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    /**
     * @return the importe
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the saldoTotal
     */
    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
    
}
