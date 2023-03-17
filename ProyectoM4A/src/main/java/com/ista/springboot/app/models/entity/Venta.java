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
@Table(name = "Venta")
public class Venta implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long VenId;
//	private String VenMetodoPago;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "VenIdPublicacion")
	private Publicacion VenIdPublicacion;
	
//	@OneToOne(mappedBy = "EncaIdVenta")
//	private EncabezadoFactura encabezadoFactura;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "VenIdComprador")
	private Usuario VenIdComprador;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "VenIdVendedor")
	private Usuario VenIdVendedor;
	/**
	 * 
	 */
	public Long getVenId() {
		return VenId;
	}
	public void setVenId(Long venId) {
		VenId = venId;
	}
	public Publicacion getVenIdPublicacion() {
		return VenIdPublicacion;
	}
	public void setVenIdPublicacion(Publicacion venIdPublicacion) {
		VenIdPublicacion = venIdPublicacion;
	}
	public Usuario getVenIdComprador() {
		return VenIdComprador;
	}
	public void setVenIdComprador(Usuario venIdComprador) {
		VenIdComprador = venIdComprador;
	}
	public Usuario getVenIdVendedor() {
		return VenIdVendedor;
	}
	public void setVenIdVendedor(Usuario venIdVendedor) {
		VenIdVendedor = venIdVendedor;
	}



}
