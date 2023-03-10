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
	private Long OfeId;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "TruNumero")
	private List<Trueque> OfeIdTrueque;
	/***
	 * 
	 */
	
	@OneToOne
	@JoinColumn(name = "OfeIdOfertante")
	private Usuario OfeIdOfertante;
	
	@OneToOne
	@JoinColumn(name = "PoIdOferta")
	private ProductoOferta PoIdOferta;
	
	private Boolean OfeEstado;
	/**
	 * 
	 */

	public Long getOfeId() {
		return OfeId;
	}

	public void setOfeId(Long oferId) {
		OfeId = oferId;
	}

	public Usuario getOfeIdOfertante() {
		return OfeIdOfertante;
	}

	public void setOfeIdOfertante(Usuario ofeIdOfertante) {
		OfeIdOfertante = ofeIdOfertante;
	}

	public Boolean getOfeEstado() {
		return OfeEstado;
	}

	public void setOfeEstado(Boolean ofeEstado) {
		OfeEstado = ofeEstado;
	}

	public ProductoOferta getPoIdOferta() {
		return PoIdOferta;
	}

	public void setPoIdOferta(ProductoOferta poIdOferta) {
		PoIdOferta = poIdOferta;
	}
	
	
	
}
