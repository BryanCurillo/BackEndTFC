package com.ista.springboot.app.models.services.I;

import java.util.List;

import com.ista.springboot.app.models.entity.DetalleFactura;

public interface IDetalleFacturaService {

	public List<DetalleFactura> findAll();
	
	public DetalleFactura save(DetalleFactura detalleFactura);
	
	public DetalleFactura findById(Long Id);
	
	public void delete(Long Id);
	
}
