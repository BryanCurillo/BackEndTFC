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
@Table (name="Publicacion")
public class Publicacion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pubID;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "pubIDVENDEDOR")
	private Usuario pubIDVENDEDOR;
	/**
	 * 
	 */
    @OneToOne
    @JoinColumn(name = "pubIDPRODUCTO")
	private Producto pubIDPRODUCTO;
	/**
	 * 
	 */
	private String pubDESCRIPCION;
	/**
	 * 
	 */
	public Long getPubID() {
		return pubID;
	}
	public void setPubID(Long pubID) {
		this.pubID = pubID;
	}
	public Usuario getPubIDVENDEDOR() {
		return pubIDVENDEDOR;
	}
	public void setPubIDVENDEDOR(Usuario pubIDVENDEDOR) {
		this.pubIDVENDEDOR = pubIDVENDEDOR;
	}
	public Producto getPubIDPRODUCTO() {
		return pubIDPRODUCTO;
	}
	public void setPubIDPRODUCTO(Producto pubIDPRODUCTO) {
		this.pubIDPRODUCTO = pubIDPRODUCTO;
	}
	public String getPubDESCRIPCION() {
		return pubDESCRIPCION;
	}
	public void setPubDESCRIPCION(String pubDESCRIPCION) {
		this.pubDESCRIPCION = pubDESCRIPCION;
	}
	
}
