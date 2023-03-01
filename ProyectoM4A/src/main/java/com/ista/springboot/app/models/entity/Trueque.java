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
@Table(name = "Trueque")
public class Trueque implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tru_numero;
	/**
	 * 
	 */
	@OneToOne(mappedBy = "enca_idTrueque")
	private EncabezadoFactura encabezadoFactura;
	
	@OneToOne
	@JoinColumn(name = "tru_idVendedor")
	private Usuario tru_idVendedor;
	
	@OneToOne
	@JoinColumn(name = "tru_idComprador")
	private Usuario tru_idComprador;
	
	@OneToOne
	@JoinColumn(name = "tru_idProducto")
	private Producto producto;
	/**
	 * 
	 */
	private Boolean tru_estado;
	/**
	 * 
	 */
	public Long getTru_numero() {
		return tru_numero;
	}
	public void setTru_numero(Long tru_numero) {
		this.tru_numero = tru_numero;
	}
	public Usuario getTru_idVendedor() {
		return tru_idVendedor;
	}
	public void setTru_idVendedor(Usuario tru_idVendedor) {
		this.tru_idVendedor = tru_idVendedor;
	}
	public Usuario getTru_idComprador() {
		return tru_idComprador;
	}
	public void setTru_idComprador(Usuario tru_idComprador) {
		this.tru_idComprador = tru_idComprador;
	}
	public Boolean getTru_estado() {
		return tru_estado;
	}
	public void setTru_estado(Boolean tru_estado) {
		this.tru_estado = tru_estado;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
