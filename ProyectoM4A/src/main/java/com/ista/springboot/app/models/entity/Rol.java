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
	private Long RolId;
	
	private String RolNombre;

	
	@OneToOne(mappedBy = "UsuIdRol")
	private Usuario UsuIdRol;
	/**
	 * 
	 */


	public Long getRolId() {
		return RolId;
	}


	public void setRolId(Long rolId) {
		RolId = rolId;
	}


	public String getRolNombre() {
		return RolNombre;
	}


	public void setRolNombre(String rolNombre) {
		RolNombre = rolNombre;
	}

}
