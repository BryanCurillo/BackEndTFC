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
    @JoinColumn(name = "UsuPerId")
	private Persona UsuPerId;
	/**
	 * 
	 */
	@Column(unique = true)
	private String UsuNombreUsuario;
	/**
	 * 
	 */
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
	public Persona getUsuPerId() {
		return UsuPerId;
	}
	public void setUsuPerId(Persona usuPerId) {
		UsuPerId = usuPerId;
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
	public Usuario(Long usuId, String usuNombreUsuario, double usuCalificacion) {
		super();
		UsuId = usuId;
		UsuNombreUsuario = usuNombreUsuario;
		UsuCalificacion = usuCalificacion;
	}

	
	
	

}
