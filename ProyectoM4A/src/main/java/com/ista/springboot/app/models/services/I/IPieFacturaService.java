package com.ista.springboot.app.models.services.I;

import java.util.List;

import com.ista.springboot.app.models.entity.PieFactura;

public interface IPieFacturaService {

	public List<PieFactura> findAll();
	
	public PieFactura save(PieFactura factura);
	
	public PieFactura findById(Long Id);
	
	public void delete(Long Id);
}
