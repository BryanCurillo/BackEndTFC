package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Oferta")
public class Oferta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ofe_id;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tru_numero")
	private List<Trueque> ofe_idTrueque;
	/***
	 * 
	 */
	
	@OneToOne
	@JoinColumn(name = "ofe_idOfertante")
	private Usuario ofe_idOfertante;
	
	private Boolean ofe_Estado;
	/**
	 * 
	 */

	public Long getOfe_id() {
		return ofe_id;
	}

	public void setOfe_id(Long ofe_id) {
		this.ofe_id = ofe_id;
	}

	public Usuario getOfe_idOfertante() {
		return ofe_idOfertante;
	}

	public void setOfe_idOfertante(Usuario ofe_idOfertante) {
		this.ofe_idOfertante = ofe_idOfertante;
	}

	public Boolean getOfe_Estado() {
		return ofe_Estado;
	}

	public void setOfe_Estado(Boolean ofe_Estado) {
		this.ofe_Estado = ofe_Estado;
	}
	
}
