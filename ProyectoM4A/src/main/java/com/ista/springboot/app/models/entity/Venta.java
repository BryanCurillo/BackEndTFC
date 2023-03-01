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
	private Long ven_id;
	private String ven_metodoPago;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "ven_idProducto")
	private Producto ven_idProducto;
	
	@OneToOne(mappedBy = "enca_idVenta")
	private EncabezadoFactura encabezadoFactura;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "ven_idComprador")
	private Usuario usuario;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "ven_idVendedor")
	private Usuario usuario1;
	/**
	 * 
	 */
	public Long getVen_id() {
		return ven_id;
	}
	public void setVen_id(Long ven_id) {
		this.ven_id = ven_id;
	}
	public String getVen_metodoPago() {
		return ven_metodoPago;
	}
	public void setVen_metodoPago(String ven_metodoPago) {
		this.ven_metodoPago = ven_metodoPago;
	}
	public Producto getVen_idProducto() {
		return ven_idProducto;
	}
	public void setVen_idProducto(Producto ven_idProducto) {
		this.ven_idProducto = ven_idProducto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Usuario getUsuario1() {
		return usuario1;
	}
	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}
}
