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
	private Long venID;
	private String venMetodoPago;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "VenIdProducto")
	private Producto VenIdProducto;
	
	@OneToOne(mappedBy = "EncaIdVenta")
	private EncabezadoFactura EncaIdVenta;
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
	public Long getVenID() {
		return venID;
	}
	public void setVenID(Long venID) {
		this.venID = venID;
	}
	public String getVenMetodoPago() {
		return venMetodoPago;
	}
	public void setVenMetodoPago(String venMetodoPago) {
		this.venMetodoPago = venMetodoPago;
	}
	public Producto getVenIdProducto() {
		return VenIdProducto;
	}
	public void setVenIdProducto(Producto venIdProducto) {
		VenIdProducto = venIdProducto;
	}
	public EncabezadoFactura getEncaIdVenta() {
		return EncaIdVenta;
	}
	public void setEncaIdVenta(EncabezadoFactura encaIdVenta) {
		EncaIdVenta = encaIdVenta;
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
