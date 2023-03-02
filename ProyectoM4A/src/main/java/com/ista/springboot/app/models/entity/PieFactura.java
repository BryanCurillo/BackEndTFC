package com.ista.springboot.app.models.entity;

import java.io.Serializable;

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
	private Long PieId;
	
	private Double PieSubTotal;
	private Double PieTotal;
	private Double PiePrecioEnvio;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "PieIdEncabezado")
	private EncabezadoFactura EncabezadoFactura;
	/**
	 * 
	 */
	public Long getPieId() {
		return PieId;
	}
	public void setPieId(Long pieId) {
		PieId = pieId;
	}
	public Double getPieSubTotal() {
		return PieSubTotal;
	}
	public void setPieSubTotal(Double pieSubTotal) {
		PieSubTotal = pieSubTotal;
	}
	public Double getPieTotal() {
		return PieTotal;
	}
	public void setPieTotal(Double pieTotal) {
		PieTotal = pieTotal;
	}
	public Double getPiePrecioEnvio() {
		return PiePrecioEnvio;
	}
	public void setPiePrecioEnvio(Double piePrecioEnvio) {
		PiePrecioEnvio = piePrecioEnvio;
	}
	public EncabezadoFactura getEncabezadoFactura() {
		return EncabezadoFactura;
	}
	public void setEncabezadoFactura(EncabezadoFactura encabezadoFactura) {
		EncabezadoFactura = encabezadoFactura;
	}
}
