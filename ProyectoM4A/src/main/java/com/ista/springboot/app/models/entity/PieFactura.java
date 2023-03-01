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
	private Long pie_id;
	
	private Double pie_subTotal;
	private Double pie_total;
	private Double pie_precioEnvio;
	/**
	 * 
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pie_idEncabezado")
	private EncabezadoFactura encabezadoFactura;
	/**
	 * 
	 */
	public Long getPie_id() {
		return pie_id;
	}
	public void setPie_id(Long pie_id) {
		this.pie_id = pie_id;
	}
	public Double getPie_subTotal() {
		return pie_subTotal;
	}
	public void setPie_subTotal(Double pie_subTotal) {
		this.pie_subTotal = pie_subTotal;
	}
	public Double getPie_total() {
		return pie_total;
	}
	public void setPie_total(Double pie_total) {
		this.pie_total = pie_total;
	}
	public Double getPie_precioEnvio() {
		return pie_precioEnvio;
	}
	public void setPie_precioEnvio(Double pie_precioEnvio) {
		this.pie_precioEnvio = pie_precioEnvio;
	}
	public EncabezadoFactura getEncabezadoFactura() {
		return encabezadoFactura;
	}
	public void setEncabezadoFactura(EncabezadoFactura encabezadoFactura) {
		this.encabezadoFactura = encabezadoFactura;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
