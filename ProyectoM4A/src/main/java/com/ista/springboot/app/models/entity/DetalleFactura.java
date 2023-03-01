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
@Table(name = "DetalleFactura")
public class DetalleFactura implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long detID;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "detIDPRODUCTO")
	private Producto detIDPRODUCTO;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "enca_numero")
	private List<EncabezadoFactura> detNUMENCABEZADO;
	/**
	 * 
	 */
	private Double detPRECIOUNITARIO;
	private Long detCANTIDAD;
	private Double detPRECIOTOTAL;
	public Long getDetID() {
		return detID;
	}
	public void setDetID(Long detID) {
		this.detID = detID;
	}
	public Producto getDetIDPRODUCTO() {
		return detIDPRODUCTO;
	}
	public void setDetIDPRODUCTO(Producto detIDPRODUCTO) {
		this.detIDPRODUCTO = detIDPRODUCTO;
	}
	public List<EncabezadoFactura> getDetNUMENCABEZADO() {
		return detNUMENCABEZADO;
	}
	public void setDetNUMENCABEZADO(List<EncabezadoFactura> detNUMENCABEZADO) {
		this.detNUMENCABEZADO = detNUMENCABEZADO;
	}
	public Double getDetPRECIOUNITARIO() {
		return detPRECIOUNITARIO;
	}
	public void setDetPRECIOUNITARIO(Double detPRECIOUNITARIO) {
		this.detPRECIOUNITARIO = detPRECIOUNITARIO;
	}
	public Long getDetCANTIDAD() {
		return detCANTIDAD;
	}
	public void setDetCANTIDAD(Long detCANTIDAD) {
		this.detCANTIDAD = detCANTIDAD;
	}
	public Double getDetPRECIOTOTAL() {
		return detPRECIOTOTAL;
	}
	public void setDetPRECIOTOTAL(Double detPRECIOTOTAL) {
		this.detPRECIOTOTAL = detPRECIOTOTAL;
	}
	
}

