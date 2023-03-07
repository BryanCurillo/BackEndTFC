package com.ista.springboot.app.models.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ProdId;
	/**
	 * 
	 */
	private String ProdNombre;
	private Double ProdPrecio;
	private String ProdDescripcion;
//	private String ProdFoto;


	@OneToOne(mappedBy = "VenIdProducto")
	private Venta VenIdProducto;

	@OneToOne(mappedBy = "DetIdProducto")
	private DetalleFactura DetIdProducto;

	@OneToOne(mappedBy = "TruIdProducto")
	private Trueque TruIdProducto;

	@OneToOne(mappedBy = "PubIdProducto")
	private Publicacion PubIdProducto;
	/**
	 * 
	 */
//	@OneToOne
//	@JoinColumn(name = "ProdIdCategoria")
//	private Categoria ProdIdCategoria;

	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "productImages", joinColumns = { @JoinColumn(name = "ProdId") }, inverseJoinColumns = {
			@JoinColumn(name = "imageId") })
	private Set<ImageModel> productImages;

	
	
	public Set<ImageModel> getProductImages() {
		return productImages;
	}

	public void setProductImages(Set<ImageModel> productImages) {
		this.productImages = productImages;
	}
	/**
	 * 
	 */
	public Long getProdId() {
		return ProdId;
	}

	public void setProdId(Long prodId) {
		ProdId = prodId;
	}

	public String getProdNombre() {
		return ProdNombre;
	}

	public void setProdNombre(String prodNombre) {
		ProdNombre = prodNombre;
	}

	public Double getProdPrecio() {
		return ProdPrecio;
	}

	public void setProdPrecio(Double prodPrecio) {
		ProdPrecio = prodPrecio;
	}

	public String getProdDescripcion() {
		return ProdDescripcion;
	}

	public void setProdDescripcion(String prodDescripcion) {
		ProdDescripcion = prodDescripcion;
	}

//	public Byte getProdFoto() {
//		return ProdFoto;
//	}
//	public void setProdFoto(Byte prodFoto) {
//		ProdFoto = prodFoto;
//	}
//	public Categoria getProdIdCategoria() {
//		return ProdIdCategoria;
//	}
//
//	public void setProdIdCategoria(Categoria prodIdCategoria) {
//		ProdIdCategoria = prodIdCategoria;
//	}




}
