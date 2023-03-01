package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.Oferta;

public interface IOfertaService {

	public List<Oferta>findAll();
	
	public Oferta save(Oferta oferta);
	
	public Oferta findById(Long Id);
	
	public void delete(Long Id);
}
