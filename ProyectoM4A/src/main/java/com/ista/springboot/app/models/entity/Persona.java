package com.ista.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Persona")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long perID;
	/**
	 * 
	 */
	private String perCEDULA;
	/**
	 * 
	 */
	private String perNOMBRE;
	private String perAPELLIDO;
	private String perCORREO;
	private String perDIRECCION;
	private String perTELEFONO;
	private String perSEXO;
	/**
	 * 
	 */

	@OneToOne(mappedBy = "usuPerCEDULA")
	private Usuario usuario;
	public Long getPerID() {
		return perID;
	}
	public void setPerID(Long perID) {
		this.perID = perID;
	}
	public String getPerCEDULA() {
		return perCEDULA;
	}
	public void setPerCEDULA(String perCEDULA) {
		this.perCEDULA = perCEDULA;
	}
	public String getPerNOMBRE() {
		return perNOMBRE;
	}
	public void setPerNOMBRE(String perNOMBRE) {
		this.perNOMBRE = perNOMBRE;
	}
	public String getPerAPELLIDO() {
		return perAPELLIDO;
	}
	public void setPerAPELLIDO(String perAPELLIDO) {
		this.perAPELLIDO = perAPELLIDO;
	}
	public String getPerCORREO() {
		return perCORREO;
	}
	public void setPerCORREO(String perCORREO) {
		this.perCORREO = perCORREO;
	}
	public String getPerDIRECCION() {
		return perDIRECCION;
	}
	public void setPerDIRECCION(String perDIRECCION) {
		this.perDIRECCION = perDIRECCION;
	}
	public String getPerTELEFONO() {
		return perTELEFONO;
	}
	public void setPerTELEFONO(String perTELEFONO) {
		this.perTELEFONO = perTELEFONO;
	}
	public String getPerSEXO() {
		return perSEXO;
	}
	public void setPerSEXO(String perSEXO) {
		this.perSEXO = perSEXO;
	}

}
