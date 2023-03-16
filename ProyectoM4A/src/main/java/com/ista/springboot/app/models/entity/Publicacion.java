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
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "PoIdPublicacion")
	private List<Oferta> OfeId;
	/**
	 * 
	 */

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
}
