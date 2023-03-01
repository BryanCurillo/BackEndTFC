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
	private Long encaID;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "encaIDTRUEQUE")
    private Trueque encaIDTRUEQUE;
    /**
     * 
     */
    @OneToOne
    @JoinColumn(name = "encaIDVENTA")
    private Venta encaIDVENTA;
    /**
     * 
     */
    @OneToOne(mappedBy = "encabezadoFactura")
    private PieFactura pieFACTURA;
    /**
     * 
     */
	@Column (name="enca_fecha")
	@Temporal(TemporalType.DATE)
    private Date encaFECHA;
    /**
     * 
     */
	@PrePersist
	public void prePersist(){
		encaFECHA = new Date();
	}
	public Long getEncaID() {
		return encaID;
	}
	public void setEncaID(Long encaID) {
		this.encaID = encaID;
	}
	public Trueque getEncaIDTRUEQUE() {
		return encaIDTRUEQUE;
	}
	public void setEncaIDTRUEQUE(Trueque encaIDTRUEQUE) {
		this.encaIDTRUEQUE = encaIDTRUEQUE;
	}
	public Venta getEncaIDVENTA() {
		return encaIDVENTA;
	}
	public void setEncaIDVENTA(Venta encaIDVENTA) {
		this.encaIDVENTA = encaIDVENTA;
	}
	public PieFactura getPieFACTURA() {
		return pieFACTURA;
	}
	public void setPieFACTURA(PieFactura pieFACTURA) {
		this.pieFACTURA = pieFACTURA;
	}
	public Date getEncaFECHA() {
		return encaFECHA;
	}
	public void setEncaFECHA(Date encaFECHA) {
		this.encaFECHA = encaFECHA;
	}

}
