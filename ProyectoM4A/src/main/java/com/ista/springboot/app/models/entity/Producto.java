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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Producto")
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prodID;
	/**
	 * 
	 */
	private String prodNOMBRE;
	private Double prodPRECIO;
	private String prodDESCRIPCION;
	private Byte prodFOTO;
	
	@OneToOne(mappedBy = "ven_idProducto")
	private Venta ven_idProducto;
	
	@OneToOne(mappedBy = "detIDPRODUCTO")
	private DetalleFactura detIDPRODUCTO;
	
	@OneToOne(mappedBy = "producto")
	private Trueque trueque;
	
	@OneToOne(mappedBy = "pubIDPRODUCTO")
	private Publicacion publicacion;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "catID")
	private List<Categoria> prodIDCATEGORIA;
	/**
	 * 
	 */
	public Long getProdID() {
		return prodID;
	}
	public void setProdID(Long prodID) {
		this.prodID = prodID;
	}
	public String getProdNOMBRE() {
		return prodNOMBRE;
	}
	public void setProdNOMBRE(String prodNOMBRE) {
		this.prodNOMBRE = prodNOMBRE;
	}
	public Double getProdPRECIO() {
		return prodPRECIO;
	}
	public void setProdPRECIO(Double prodPRECIO) {
		this.prodPRECIO = prodPRECIO;
	}
	public String getProdDESCRIPCION() {
		return prodDESCRIPCION;
	}
	public void setProdDESCRIPCION(String prodDESCRIPCION) {
		this.prodDESCRIPCION = prodDESCRIPCION;
	}
	public Byte getProdFOTO() {
		return prodFOTO;
	}
	public void setProdFOTO(Byte prodFOTO) {
		this.prodFOTO = prodFOTO;
	}
	public List<Categoria> getProdIDCATEGORIA() {
		return prodIDCATEGORIA;
	}
	public void setProdIDCATEGORIA(List<Categoria> prodIDCATEGORIA) {
		this.prodIDCATEGORIA = prodIDCATEGORIA;
	}

}
