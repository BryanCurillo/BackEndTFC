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
//	@OneToOne(mappedBy = "TruIdOferta")
//	private Trueque TruIdOferta;
	/***
	 * 
	 */
	
	@OneToOne
	@JoinColumn(name = "OfeIdOfertante")
	private Usuario OfeIdOfertante;
	
	@OneToOne
	@JoinColumn(name = "PoIdOferta")
	private ProductoOferta PoIdOferta;
	
//	@OneToOne
//	@JoinColumn(name = "OfeIdPublicacion")
//	private Publicacion OfeIdPublicacion;
	
	
	private Boolean OfeEstado;
	/**
	 * 
	 */

	public Long getOfeId() {
		return OfeId;
	}

//	public Trueque getTruIdOferta() {
//		return TruIdOferta;
//	}
//
//	public void setTruIdOferta(Trueque truIdOferta) {
//		TruIdOferta = truIdOferta;
//	}

	public Boolean getOfeEstado() {
		return OfeEstado;
	}

	public void setOfeEstado(Boolean ofeEstado) {
		OfeEstado = ofeEstado;
	}

	public void setOfeId(Long ofeId) {
		OfeId = ofeId;
	}

	public Usuario getOfeIdOfertante() {
		return OfeIdOfertante;
	}

	public void setOfeIdOfertante(Usuario ofeIdOfertante) {
		OfeIdOfertante = ofeIdOfertante;
	}

	public ProductoOferta getPoIdOferta() {
		return PoIdOferta;
	}

	public void setPoIdOferta(ProductoOferta poIdOferta) {
		PoIdOferta = poIdOferta;
	}


	
}
//public Publicacion getOfeIdPublicacion() {
//return OfeIdPublicacion;
//}
//
//public void setOfeIdPublicacion(Publicacion ofeIdPublicacion) {
//OfeIdPublicacion = ofeIdPublicacion;
//}
