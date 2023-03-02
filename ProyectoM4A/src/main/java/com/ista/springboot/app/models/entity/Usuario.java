package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Usuario")
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long UsuId;
	/**
	 * 
	 */
	@OneToOne(mappedBy = "TruIdVendedor")
	private Trueque TruIdVendedor;
	
	@OneToOne(mappedBy = "TruIdComprador")
	private Trueque TruIdComprador;
	
	@OneToOne(mappedBy = "VenIdComprador")
	private Venta VenIdComprador;
	
	@OneToOne(mappedBy = "VenIdVendedor")
	private Venta VenIdVendedor;
	
	@OneToOne(mappedBy = "OfeIdOfertante")
	private Oferta OfeIdOfertante;
	
	@OneToOne(mappedBy = "PubIdVendedor")
	private Publicacion PubIdVendedor;
	
	
    @OneToOne
    @JoinColumn(name = "UsuPerCedula")
	private Persona UsuPerCedula;
    
    
    @OneToOne
    @JoinColumn(name = "UsuIdRol")
	private Rol UsuIdRol;
	/**
	 * 
	 */
	@Column(unique = true)
	private String UsuNombreUsuario;
	private String UsuContraUsuario;
	private double UsuCalificacion;
	/**
	 * 
	 */
	public Long getUsuId() {
		return UsuId;
	}
	public void setUsuId(Long usuId) {
		UsuId = usuId;
	}
	public Trueque getTruIdVendedor() {
		return TruIdVendedor;
	}
	public void setTruIdVendedor(Trueque truIdVendedor) {
		TruIdVendedor = truIdVendedor;
	}
	public Trueque getTruIdComprador() {
		return TruIdComprador;
	}
	public void setTruIdComprador(Trueque truIdComprador) {
		TruIdComprador = truIdComprador;
	}
	public Venta getVenIdComprador() {
		return VenIdComprador;
	}
	public void setVenIdComprador(Venta venIdComprador) {
		VenIdComprador = venIdComprador;
	}
	public Venta getVenIdVendedor() {
		return VenIdVendedor;
	}
	public void setVenIdVendedor(Venta venIdVendedor) {
		VenIdVendedor = venIdVendedor;
	}
	public Oferta getOfeIdOfertante() {
		return OfeIdOfertante;
	}
	public void setOfeIdOfertante(Oferta ofeIdOfertante) {
		OfeIdOfertante = ofeIdOfertante;
	}
	public Publicacion getPubIdVendedor() {
		return PubIdVendedor;
	}
	public void setPubIdVendedor(Publicacion pubIdVendedor) {
		PubIdVendedor = pubIdVendedor;
	}
	public Persona getUsuPerCedula() {
		return UsuPerCedula;
	}
	public void setUsuPerCedula(Persona usuPerCedula) {
		UsuPerCedula = usuPerCedula;
	}
	public Rol getUsuIdRol() {
		return UsuIdRol;
	}
	public void setUsuIdRol(Rol usuIdRol) {
		UsuIdRol = usuIdRol;
	}
	public String getUsuNombreUsuario() {
		return UsuNombreUsuario;
	}
	public void setUsuNombreUsuario(String usuNombreUsuario) {
		UsuNombreUsuario = usuNombreUsuario;
	}
	public String getUsuContraUsuario() {
		return UsuContraUsuario;
	}
	public void setUsuContraUsuario(String usuContraUsuario) {
		UsuContraUsuario = usuContraUsuario;
	}
	public double getUsuCalificacion() {
		return UsuCalificacion;
	}
	public void setUsuCalificacion(double usuCalificacion) {
		UsuCalificacion = usuCalificacion;
	}
	public Usuario() {
		super();
	}
	public Usuario(String usuNombreUsuario, String usuContraUsuario) {
		super();
		UsuNombreUsuario = usuNombreUsuario;
		UsuContraUsuario = usuContraUsuario;
	}

	
}
