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
@Table(name = "Trueque")
public class Trueque implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long TruNumero;
	/**
	 * 
	 */
	@OneToOne(mappedBy = "EncaIdTrueque")
	private EncabezadoFactura encabezadoFactura;
	
	@OneToOne
	@JoinColumn(name = "TruIdVendedor")
	private Usuario TruIdVendedor;
	
	@OneToOne
	@JoinColumn(name = "TruIdOferta")
	private Oferta TruIdOferta;
	
	@OneToOne
	@JoinColumn(name = "TruIdComprador")
	private Usuario TruIdComprador;
	
	@OneToOne
	@JoinColumn(name = "TruIdProducto")
	private Producto TruIdProducto;
	/**
	 * 
	 */
	private Boolean TruEstado;
	/**
	 * 
	 */
	public Long getTruNumero() {
		return TruNumero;
	}
	public void setTruNumero(Long truNumero) {
		TruNumero = truNumero;
	}
	public Usuario getTruIdVendedor() {
		return TruIdVendedor;
	}
	public void setTruIdVendedor(Usuario truIdVendedor) {
		TruIdVendedor = truIdVendedor;
	}
	public Oferta getTruIdOferta() {
		return TruIdOferta;
	}
	public void setTruIdOferta(Oferta truIdOferta) {
		TruIdOferta = truIdOferta;
	}
	public Usuario getTruIdComprador() {
		return TruIdComprador;
	}
	public void setTruIdComprador(Usuario truIdComprador) {
		TruIdComprador = truIdComprador;
	}
	public Producto getTruIdProducto() {
		return TruIdProducto;
	}
	public void setTruIdProducto(Producto truIdProducto) {
		TruIdProducto = truIdProducto;
	}
	public Boolean getTruEstado() {
		return TruEstado;
	}
	public void setTruEstado(Boolean truEstado) {
		TruEstado = truEstado;
	}
}
