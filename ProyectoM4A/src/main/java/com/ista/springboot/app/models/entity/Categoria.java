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
	private Long CatId;
	private String CatNombre;
	/**
	 * 
	 */
	
	@OneToOne(mappedBy = "ProdIdCategoria")
	private Producto ProdIdCategoria;
	
	public Long getCatId() {
		return CatId;
	}
	public void setCatId(Long catId) {
		CatId = catId;
	}
	public String getCatNombre() {
		return CatNombre;
	}
	public void setCatNombre(String catNombre) {
		CatNombre = catNombre;
	}



}
