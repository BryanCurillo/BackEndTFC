package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto save(Producto producto);
	
	public Producto findById(Long Id);
	
	public void delete(Long Id);

}
