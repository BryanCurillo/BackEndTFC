package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.Rol;

public interface IRolService {
	
	public List<Rol> findAll();
	
	public Rol save(Rol rol);
	
	public Rol findById(Long Id);
	
	public void delete(Long Id);
}
