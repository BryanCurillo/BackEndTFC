package com.ista.springboot.app.models.services.I;

import java.util.List;

import com.ista.springboot.app.models.entity.ProductoOferta;

public interface IProductoOfertaService {
	
	public List<ProductoOferta> findAll();
	
	public ProductoOferta save (ProductoOferta oferta);
	
	public  ProductoOferta findById(Long Id);
	
	public void delete(Long Id);
}
