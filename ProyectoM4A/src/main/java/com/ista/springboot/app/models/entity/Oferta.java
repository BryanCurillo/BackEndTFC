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
	
	@OneToOne(mappedBy = "PodIdOferta")
	private ProductoOferta PodIdOferta;
	
	@OneToOne
	@JoinColumn(name = "OfeIdOfertante")
	private Usuario OfeIdOfertante;
	
	private Boolean OfeEstado;
	/**
	 * 
	 */

	public Long getOfeId() {
		return OfeId;
	}

	public void setOfeId(Long ofeId) {
		OfeId = ofeId;
	}

	public List<Trueque> getOfeIdTrueque() {
		return OfeIdTrueque;
	}

	public void setOfeIdTrueque(List<Trueque> ofeIdTrueque) {
		OfeIdTrueque = ofeIdTrueque;
	}

	public ProductoOferta getPodIdOferta() {
		return PodIdOferta;
	}

	public void setPodIdOferta(ProductoOferta podIdOferta) {
		PodIdOferta = podIdOferta;
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
	
}
