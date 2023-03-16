package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String FileName;


	@OneToOne(mappedBy = "VenIdProducto")
	private Venta VenIdProducto;

	@OneToOne(mappedBy = "DetIdProducto")
	private DetalleFactura DetIdProducto;

//	@OneToOne(mappedBy = "TruIdProducto")
//	private Trueque TruIdProducto;

	@OneToOne(mappedBy = "PubIdProducto")
	private Publicacion PubIdProducto;
	/**
	 * 
	 */
	private Long ProdIdCategoria;
	/**
	 * 
	 */
	
	
	public Long getProdId() {
		return ProdId;
	}

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
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

	public Long getProdIdCategoria() {
		return ProdIdCategoria;
	}

	public void setProdIdCategoria(Long prodIdCategoria) {
		ProdIdCategoria = prodIdCategoria;
	}
//	public Byte getProdFoto() {
//		return ProdFoto;
//	}
//	public void setProdFoto(Byte prodFoto) {
//		ProdFoto = prodFoto;
//	}
	




}
