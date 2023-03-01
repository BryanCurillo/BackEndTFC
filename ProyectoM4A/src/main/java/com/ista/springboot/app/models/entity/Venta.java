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
	private String venMETODOPAGO;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "venIDPRODUCTO")
	private Producto ven_idProducto;
	
	@OneToOne(mappedBy = "encaIDVENTA")
	private EncabezadoFactura encabezadoFactura;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "venIDCOMPRADOR")
	private Usuario usuario;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "venIDVENDEDOR")
	private Usuario usuario1;
	/**
	 * 
	 */
	public Long getVenID() {
		return venID;
	}
	public void setVenID(Long venID) {
		this.venID = venID;
	}
	public String getVenMETODOPAGO() {
		return venMETODOPAGO;
	}
	public void setVenMETODOPAGO(String venMETODOPAGO) {
		this.venMETODOPAGO = venMETODOPAGO;
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
