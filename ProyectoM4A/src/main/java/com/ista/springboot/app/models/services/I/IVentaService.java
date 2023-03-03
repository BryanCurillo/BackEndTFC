package com.ista.springboot.app.models.services.I;

import java.util.List;

import com.ista.springboot.app.models.entity.Venta;

public interface IVentaService {

	public List<Venta> findAll();
	
	public Venta save (Venta venta);
	
	public Venta findById(Long Id);
	
	public void delete(Long Id);
}
