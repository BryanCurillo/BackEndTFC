package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PieFactura")
public class PieFactura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/***
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pieID;
	
	private Double pieSUBTOTAL;
	private Double pieTOTAL;
	private Double piePRECIOENVIO;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pieIDENCABEZADO")
	private EncabezadoFactura encabezadoFactura;
	/**
	 * 
	 */
	public Long getPieID() {
		return pieID;
	}
	public void setPieID(Long pieID) {
		this.pieID = pieID;
	}
	public Double getPieSUBTOTAL() {
		return pieSUBTOTAL;
	}
	public void setPieSUBTOTAL(Double pieSUBTOTAL) {
		this.pieSUBTOTAL = pieSUBTOTAL;
	}
	public Double getPieTOTAL() {
		return pieTOTAL;
	}
	public void setPieTOTAL(Double pieTOTAL) {
		this.pieTOTAL = pieTOTAL;
	}
	public Double getPiePRECIOENVIO() {
		return piePRECIOENVIO;
	}
	public void setPiePRECIOENVIO(Double piePRECIOENVIO) {
		this.piePRECIOENVIO = piePRECIOENVIO;
	}
	public EncabezadoFactura getEncabezadoFactura() {
		return encabezadoFactura;
	}
	public void setEncabezadoFactura(EncabezadoFactura encabezadoFactura) {
		this.encabezadoFactura = encabezadoFactura;
	}
	
}
