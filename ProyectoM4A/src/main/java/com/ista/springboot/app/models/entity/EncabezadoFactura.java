package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EncabezadoFactura")
public class EncabezadoFactura implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long EncaId;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "EncaIdTrueque")
    private Trueque EncaIdTrueque;
    /**
     * 
     */
    @OneToOne
    @JoinColumn(name = "EncaIdVenta")
    private Venta EncaIdVenta;
    /**
     * 
     */
    @OneToOne(mappedBy = "EncabezadoFactura")
    private PieFactura PieFactura;
    /**
     * 
     */
	@Column (name="EncaFecha")
	@Temporal(TemporalType.DATE)
    private Date EncaFecha;
    /**
     * 
     */
	@PrePersist
	public void prePersist(){
		EncaFecha = new Date();
	}
    /**
     * 
     */
	public Long getEncaId() {
		return EncaId;
	}
	public void setEncaId(Long encaId) {
		EncaId = encaId;
	}
	public Trueque getEncaIdTrueque() {
		return EncaIdTrueque;
	}
	public void setEncaIdTrueque(Trueque encaIdTrueque) {
		EncaIdTrueque = encaIdTrueque;
	}
	public Venta getEncaIdVenta() {
		return EncaIdVenta;
	}
	public void setEncaIdVenta(Venta encaIdVenta) {
		EncaIdVenta = encaIdVenta;
	}
	public PieFactura getPieFactura() {
		return PieFactura;
	}
	public void setPieFactura(PieFactura pieFactura) {
		PieFactura = pieFactura;
	}
	public Date getEncaFecha() {
		return EncaFecha;
	}
	public void setEncaFecha(Date encaFecha) {
		EncaFecha = encaFecha;
	}
}
