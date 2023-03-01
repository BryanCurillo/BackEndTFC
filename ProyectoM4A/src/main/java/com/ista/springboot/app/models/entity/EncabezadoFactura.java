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
	private Long enca_numero;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "enca_idTrueque")
    private Trueque enca_idTrueque;
    /**
     * 
     */
    @OneToOne
    @JoinColumn(name = "enca_idVenta")
    private Venta enca_idVenta;
    /**
     * 
     */
    @OneToOne(mappedBy = "encabezadoFactura")
    private PieFactura pieFactura;
    /**
     * 
     */
	@Column (name="enca_fecha")
	@Temporal(TemporalType.DATE)
    private Date enca_fecha;
    /**
     * 
     */
	@PrePersist
	public void prePersist(){
		enca_fecha = new Date();
	}
	public Long getEnca_numero() {
		return enca_numero;
	}
	public void setEnca_numero(Long enca_numero) {
		this.enca_numero = enca_numero;
	}
	public Trueque getEnca_idTrueque() {
		return enca_idTrueque;
	}
	public void setEnca_idTrueque(Trueque enca_idTrueque) {
		this.enca_idTrueque = enca_idTrueque;
	}
	public Venta getEnca_idVenta() {
		return enca_idVenta;
	}
	public void setEnca_idVenta(Venta enca_idVenta) {
		this.enca_idVenta = enca_idVenta;
	}
	public PieFactura getPieFactura() {
		return pieFactura;
	}
	public void setPieFactura(PieFactura pieFactura) {
		this.pieFactura = pieFactura;
	}
	public Date getEnca_fecha() {
		return enca_fecha;
	}
	public void setEnca_fecha(Date enca_fecha) {
		this.enca_fecha = enca_fecha;
	}
	
	
	

}
