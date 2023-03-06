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
@Table (name="Publicacion")
public class Publicacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PubId;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "PubIdVendedor")
	private Usuario PubIdVendedor;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "PubIdProducto")
	private Producto PubIdProducto;
	/**
	 * 
	 */
	private String PubDescripcion;
	/**
	 * 
	 */
	public Long getPubId() {
		return PubId;
	}
	public void setPubId(Long pubId) {
		PubId = pubId;
	}
	public Usuario getPubIdVendedor() {
		return PubIdVendedor;
	}
	public void setPubIdVendedor(Usuario pubIdVendedor) {
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

}
