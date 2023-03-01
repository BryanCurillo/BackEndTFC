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
	private Long rolID;
	
	private String rolNOMBRE;

	
	@OneToOne(mappedBy = "usu_idRol")
	private Usuario usuario;


	public Long getRolID() {
		return rolID;
	}


	public void setRolID(Long rolID) {
		this.rolID = rolID;
	}


	public String getRolNOMBRE() {
		return rolNOMBRE;
	}


	public void setRolNOMBRE(String rolNOMBRE) {
		this.rolNOMBRE = rolNOMBRE;
	}

}
