package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Rol")
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rol_id;
	
	private String rol_nombre;

	
	@OneToOne(mappedBy = "usu_idRol")
	private Usuario usuario;


	public Long getRol_id() {
		return rol_id;
	}


	public void setRol_id(Long rol_id) {
		this.rol_id = rol_id;
	}


	public String getRol_nombre() {
		return rol_nombre;
	}


	public void setRol_nombre(String rol_nombre) {
		this.rol_nombre = rol_nombre;
	}

}
