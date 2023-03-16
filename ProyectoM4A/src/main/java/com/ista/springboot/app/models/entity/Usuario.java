package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
//	@OneToOne(mappedBy = "TruIdVendedor")
//	private Trueque TruIdVendedor;
	
//	@OneToOne(mappedBy = "TruIdComprador")
//	private Trueque TruIdComprador;
	
	@OneToOne(mappedBy = "VenIdComprador")
	private Venta VenIdComprador;
	
	@OneToOne(mappedBy = "VenIdVendedor")
	private Venta VenIdVendedor;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "PubIdVendedor")
	private List<Publicacion> PubIdVendedor;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "OfeIdOfertante")
	private List<Oferta> OfeIdOfertante;
	
	
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
	private boolean UsuEstado;
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
	
	public boolean getUsuEstado() {
		return UsuEstado;
	}
	public void setUsuEstado(boolean usuEstado) {
		UsuEstado = usuEstado;
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
	
	
	public Usuario() {
		super();
	}

	//enviar los datos para que el administrador los pueda visualizar
	public Usuario(Long usuId,String usuContraUsuario , String usuNombreUsuario) {
		super();
		UsuId = usuId;
		UsuNombreUsuario = usuNombreUsuario;
		UsuContraUsuario = usuContraUsuario;
	}
	
	
	

}
