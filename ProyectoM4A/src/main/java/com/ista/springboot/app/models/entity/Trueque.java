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
@Table(name = "Trueque")
public class Trueque implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tru_numero;
	/**
	 * 
	 */
	@OneToOne(mappedBy = "encaIDTRUEQUE")
	private EncabezadoFactura encabezadoFactura;
	
	@OneToOne
	@JoinColumn(name = "truIDVENDEDOR")
	private Usuario truIDVENDEDOR;
	
	@OneToOne
	@JoinColumn(name = "truIDCOMPRADOR")
	private Usuario truIDCOMPRADOR;
	
	@OneToOne
	@JoinColumn(name = "truIDPRODUCTO")
	private Producto producto;
	/**
	 * 
	 */
	private Boolean truESTADO;
	/**
	 * 
	 */
	public Long getTru_numero() {
		return tru_numero;
	}
	public void setTru_numero(Long tru_numero) {
		this.tru_numero = tru_numero;
	}
	public Usuario getTruIDVENDEDOR() {
		return truIDVENDEDOR;
	}
	public void setTruIDVENDEDOR(Usuario truIDVENDEDOR) {
		this.truIDVENDEDOR = truIDVENDEDOR;
	}
	public Usuario getTruIDCOMPRADOR() {
		return truIDCOMPRADOR;
	}
	public void setTruIDCOMPRADOR(Usuario truIDCOMPRADOR) {
		this.truIDCOMPRADOR = truIDCOMPRADOR;
	}
	public Boolean getTruESTADO() {
		return truESTADO;
	}
	public void setTruESTADO(Boolean truESTADO) {
		this.truESTADO = truESTADO;
	}
	

}
