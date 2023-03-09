package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {
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
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ProdIdCategoria")
	private List<Producto> ProdId;
	/**
	 * 
	 */

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

	public List<Producto> getProdId() {
		return ProdId;
	}

	public void setProdId(List<Producto> prodId) {
		ProdId = prodId;
	}

	
}
