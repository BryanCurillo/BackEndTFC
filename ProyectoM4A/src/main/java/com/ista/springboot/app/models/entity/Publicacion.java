package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
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

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.PrePersist;

@Entity
@Table (name="Publicacion")
public class Publicacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Publicacion() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PubId;
	/**
	 * 
	 */
	private Long PubIdVendedor;
	

	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "OfePubId")
	private List<Oferta> OfePubId;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "OfeId")
	private List<Usuario> PubOfeId;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "PubIdProducto")
	private Producto PubIdProducto;
    
//	@OneToOne(mappedBy = "OfeIdPublicacion")
//	private Oferta OfeIdPublicacion;
	/**
	 * 
	 */
	private String PubDescripcion;
	
	private String PubTipo;
	/**
	 * 
	 */
	
	@Temporal(TemporalType.DATE)
	private Date PubFecha;
	
	@PrePersist
	public void prePersist() {
		PubFecha = new Date();
	}
	
	public Long getPubId() {
		return PubId;
	}

	public void setPubId(Long pubId) {
		PubId = pubId;
	}

	public Long getPubIdVendedor() {
		return PubIdVendedor;
	}

	public void setPubIdVendedor(Long pubIdVendedor) {
		PubIdVendedor = pubIdVendedor;
	}

	public Producto getPubIdProducto() {
		return PubIdProducto;
	}

	public void setPubIdProducto(Producto pubIdProducto) {
		PubIdProducto = pubIdProducto;
	}

	public String getPubDescripcion() {
		return PubDescripcion;
	}

	public void setPubDescripcion(String pubDescripcion) {
		PubDescripcion = pubDescripcion;
	}

	public String getPubTipo() {
		return PubTipo;
	}

	public void setPubTipo(String pubTipo) {
		PubTipo = pubTipo;
	}

	public Date getPubFecha() {
		return PubFecha;
	}

	public void setPubFecha(Date pubFecha) {
		PubFecha = pubFecha;
	}
	
}
