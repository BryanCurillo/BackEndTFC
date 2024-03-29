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
	private Long OfeIdOfertante;
	private Long OfePubId;
	
	@OneToOne
	@JoinColumn(name = "PoIdOferta")
	private ProductoOferta PoIdOferta;
	
	private Long PoIdPublicacion;
	
	private Boolean OfeEstado;
	/**
	 * 
	 */
	public Long getOfeId() {
		return OfeId;
	}

	public Long getPoIdPublicacion() {
		return PoIdPublicacion;
	}

	public void setPoIdPublicacion(Long poIdPublicacion) {
		PoIdPublicacion = poIdPublicacion;
	}

	public Boolean getOfeEstado() {
		return OfeEstado;
	}

	public void setOfeEstado(Boolean ofeEstado) {
		OfeEstado = ofeEstado;
	}

	public void setOfeId(Long ofeId) {
		OfeId = ofeId;
	}

	public Long getOfeIdOfertante() {
		return OfeIdOfertante;
	}

	public void setOfeIdOfertante(Long ofeIdOfertante) {
		OfeIdOfertante = ofeIdOfertante;
	}

	public ProductoOferta getPoIdOferta() {
		return PoIdOferta;
	}

	public void setPoIdOferta(ProductoOferta poIdOferta) {
		PoIdOferta = poIdOferta;
	}

	public Long getOfePubId() {
		return OfePubId;
	}

	public void setOfePubId(Long ofePubId) {
		OfePubId = ofePubId;
	}
	
}

