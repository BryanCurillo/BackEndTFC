package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProductoOferta")
public class ProductoOferta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long poID;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "poIDOFERTA")
	private Oferta oferta;
	/**
	 * 
	 */
	private String poNOMBRE;
	private Double poPRECIO;
	private Byte poFOTO;
	private String poDESCRIPCION;
	/**
	 * 
	 */
	public Long getPoID() {
		return poID;
	}
	public void setPoID(Long poID) {
		this.poID = poID;
	}
	public Oferta getOferta() {
		return oferta;
	}
	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	public String getPoNOMBRE() {
		return poNOMBRE;
	}
	public void setPoNOMBRE(String poNOMBRE) {
		this.poNOMBRE = poNOMBRE;
	}
	public Double getPoPRECIO() {
		return poPRECIO;
	}
	public void setPoPRECIO(Double poPRECIO) {
		this.poPRECIO = poPRECIO;
	}
	public Byte getPoFOTO() {
		return poFOTO;
	}
	public void setPoFOTO(Byte poFOTO) {
		this.poFOTO = poFOTO;
	}
	public String getPoDESCRIPCION() {
		return poDESCRIPCION;
	}
	public void setPoDESCRIPCION(String poDESCRIPCION) {
		this.poDESCRIPCION = poDESCRIPCION;
	}
	
}
