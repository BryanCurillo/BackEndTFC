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
@Table(name = "ProductoOferta")
public class ProductoOferta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PoId;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "PodIdOferta")
	private Oferta PodIdOferta;
	/**
	 * 
	 */
	private String PoNombre;
	private Double PoPrecio;
	private String PoFoto;
	private String PoDescripcion;
	/**
	 * 
	 */
	public Long getPoId() {
		return PoId;
	}
	public void setPoId(Long poId) {
		PoId = poId;
	}
	public Oferta getPodIdOferta() {
		return PodIdOferta;
	}
	public void setPodIdOferta(Oferta podIdOferta) {
		PodIdOferta = podIdOferta;
	}
	public String getPoNombre() {
		return PoNombre;
	}
	public void setPoNombre(String poNombre) {
		PoNombre = poNombre;
	}
	public Double getPoPrecio() {
		return PoPrecio;
	}
	public void setPoPrecio(Double poPrecio) {
		PoPrecio = poPrecio;
	}
	public String getPoFoto() {
		return PoFoto;
	}
	public void setPoFoto(String poFoto) {
		PoFoto = poFoto;
	}
	public String getPoDescripcion() {
		return PoDescripcion;
	}
	public void setPoDescripcion(String poDescripcion) {
		PoDescripcion = poDescripcion;
	}

}
