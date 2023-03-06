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
	private Long DetId;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "DetIdProducto")
	private Producto DetIdProducto;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "EncaNumero")
	private List<EncabezadoFactura> DetNumEncabezado;
	/**
	 * 
	 */
	private Double DetPrecioUnitario;
	private Long DetCantidad;
	private Double DetPrecioTotal;
	
	public Long getDetId() {
		return DetId;
	}
	public void setDetId(Long detId) {
		DetId = detId;
	}
	public Producto getDetIdProducto() {
		return DetIdProducto;
	}
	public void setDetIdProducto(Producto detIdProducto) {
		DetIdProducto = detIdProducto;
	}
	public List<EncabezadoFactura> getDetNumEncabezado() {
		return DetNumEncabezado;
	}
	public void setDetNumEncabezado(List<EncabezadoFactura> detNumEncabezado) {
		DetNumEncabezado = detNumEncabezado;
	}
	public Double getDetPrecioUnitario() {
		return DetPrecioUnitario;
	}
	public void setDetPrecioUnitario(Double detPrecioUnitario) {
		DetPrecioUnitario = detPrecioUnitario;
	}
	public Long getDetCantidad() {
		return DetCantidad;
	}
	public void setDetCantidad(Long detCantidad) {
		DetCantidad = detCantidad;
	}
	public Double getDetPrecioTotal() {
		return DetPrecioTotal;
	}
	public void setDetPrecioTotal(Double detPrecioTotal) {
		DetPrecioTotal = detPrecioTotal;
	}
}

