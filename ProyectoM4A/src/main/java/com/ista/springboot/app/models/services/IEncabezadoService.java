package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.EncabezadoFactura;

public interface IEncabezadoService {
	
	public List<EncabezadoFactura> findAll();
	
	public EncabezadoFactura save(EncabezadoFactura encabezadoFactura);
	
	public EncabezadoFactura findById(Long Id);
	
	public void delete(Long Id);
	

}
