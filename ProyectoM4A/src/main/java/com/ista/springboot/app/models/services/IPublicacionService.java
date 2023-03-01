package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.Publicacion;

public interface IPublicacionService {
	
	public List<Publicacion> findAll();
	
	public Publicacion save (Publicacion publicacion);
	
	public Publicacion findById(Long Id);
	
	public void delete(Long Id);
}
