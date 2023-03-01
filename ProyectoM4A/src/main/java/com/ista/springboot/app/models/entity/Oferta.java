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
@Table(name = "Oferta")
public class Oferta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ofeID;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tru_numero")
	private List<Trueque> ofeIDTRUEQUE;
	/***
	 * 
	 */
	
	@OneToOne(mappedBy = "oferta")
	private ProductoOferta oferta;
	
	@OneToOne
	@JoinColumn(name = "ofeIDOFERTANTE")
	private Usuario ofeIDOFERTANTE;
	
	private Boolean ofeESTADO;
	/**
	 * 
	 */

	public Long getOfeID() {
		return ofeID;
	}

	public void setOfeID(Long ofeID) {
		this.ofeID = ofeID;
	}

	public List<Trueque> getOfeIDTRUEQUE() {
		return ofeIDTRUEQUE;
	}

	public void setOfeIDTRUEQUE(List<Trueque> ofeIDTRUEQUE) {
		this.ofeIDTRUEQUE = ofeIDTRUEQUE;
	}

	public Usuario getOfeIDOFERTANTE() {
		return ofeIDOFERTANTE;
	}

	public void setOfeIDOFERTANTE(Usuario ofeIDOFERTANTE) {
		this.ofeIDOFERTANTE = ofeIDOFERTANTE;
	}

	public Boolean getOfeESTADO() {
		return ofeESTADO;
	}

	public void setOfeESTADO(Boolean ofeESTADO) {
		this.ofeESTADO = ofeESTADO;
	}
	
}
