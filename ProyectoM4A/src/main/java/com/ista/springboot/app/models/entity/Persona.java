package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Persona")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PerId;
	/**
	 * 
	 */
	@Column(unique = true, name = "PerCedula")
	private String PerCedula;
	/**
	 * 
	 */
	private String PerNombre;
	private String PerApellido;
	private String PerCorreo;
	private String PerDireccion;
	private String PerTelefono;
	private String PerSexo;
	/**
	 * 
	 */
	@OneToOne(mappedBy = "UsuPerId")
	private Usuario usuario;
	/**
	 * 
	 */
	public Long getPerId() {
		return PerId;
	}
	public void setPerId(Long perId) {
		PerId = perId;
	}
	public String getPerCedula() {
		return PerCedula;
	}
	public void setPerCedula(String perCedula) {
		PerCedula = perCedula;
	}
	public String getPerNombre() {
		return PerNombre;
	}
	public void setPerNombre(String perNombre) {
		PerNombre = perNombre;
	}
	public String getPerApellido() {
		return PerApellido;
	}
	public void setPerApellido(String perApellido) {
		PerApellido = perApellido;
	}
	public String getPerCorreo() {
		return PerCorreo;
	}
	public void setPerCorreo(String perCorreo) {
		PerCorreo = perCorreo;
	}
	public String getPerDireccion() {
		return PerDireccion;
	}
	public void setPerDireccion(String perDireccion) {
		PerDireccion = perDireccion;
	}
	public String getPerTelefono() {
		return PerTelefono;
	}
	public void setPerTelefono(String perTelefono) {
		PerTelefono = perTelefono;
	}
	public String getPerSexo() {
		return PerSexo;
	}
	public void setPerSexo(String perSexo) {
		PerSexo = perSexo;
	}
}
