package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Categoria")
public class Categoria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catID;
	private String catNOMBRE;
	/**
	 * 
	 */
	public Long getCatID() {
		return catID;
	}
	public void setCatID(Long catID) {
		this.catID = catID;
	}
	public String getCatNOMBRE() {
		return catNOMBRE;
	}
	public void setCatNOMBRE(String catNOMBRE) {
		this.catNOMBRE = catNOMBRE;
	}

}
