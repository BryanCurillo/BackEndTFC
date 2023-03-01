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
	private Long det_id;
	/**
	 * 
	 */
	@OneToOne
	@JoinColumn(name = "det_idProducto")
	private Producto det_idProducto;
	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "enca_numero")
	private List<EncabezadoFactura> det_numEncabezado;
	/**
	 * 
	 */
	private Double det_precioUnitario;
	private Long det_cantidad;
	private Double det_precioTotal;
	
	
	public Long getDet_id() {
		return det_id;
	}
	public void setDet_id(Long det_id) {
		this.det_id = det_id;
	}
	public Producto getDet_idProducto() {
		return det_idProducto;
	}
	public void setDet_idProducto(Producto det_idProducto) {
		this.det_idProducto = det_idProducto;
	}
	public List<EncabezadoFactura> getDet_numEncabezado() {
		return det_numEncabezado;
	}
	public void setDet_numEncabezado(List<EncabezadoFactura> det_numEncabezado) {
		this.det_numEncabezado = det_numEncabezado;
	}
	public Double getDet_precioUnitario() {
		return det_precioUnitario;
	}
	public void setDet_precioUnitario(Double det_precioUnitario) {
		this.det_precioUnitario = det_precioUnitario;
	}
	public Long getDet_cantidad() {
		return det_cantidad;
	}
	public void setDet_cantidad(Long det_cantidad) {
		this.det_cantidad = det_cantidad;
	}
	public Double getDet_precioTotal() {
		return det_precioTotal;
	}
	public void setDet_precioTotal(Double det_precioTotal) {
		this.det_precioTotal = det_precioTotal;
	}
	
}

