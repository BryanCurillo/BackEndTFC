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
	private Long po_id;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "po_idOferta")
	private Oferta oferta;
	/**
	 * 
	 */
	private String po_nombre;
	private Double po_precio;
	private Byte po_foto;
	private String po_descripcion;
	/**
	 * 
	 */
	public Long getPo_id() {
		return po_id;
	}
	public void setPo_id(Long po_id) {
		this.po_id = po_id;
	}
	public Oferta getOferta() {
		return oferta;
	}
	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	public String getPo_nombre() {
		return po_nombre;
	}
	public void setPo_nombre(String po_nombre) {
		this.po_nombre = po_nombre;
	}
	public Double getPo_precio() {
		return po_precio;
	}
	public void setPo_precio(Double po_precio) {
		this.po_precio = po_precio;
	}
	public Byte getPo_foto() {
		return po_foto;
	}
	public void setPo_foto(Byte po_foto) {
		this.po_foto = po_foto;
	}
	public String getPo_descripcion() {
		return po_descripcion;
	}
	public void setPo_descripcion(String po_descripcion) {
		this.po_descripcion = po_descripcion;
	}
	
}
