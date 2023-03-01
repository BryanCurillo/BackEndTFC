package com.ista.springboot.app.models.services;

import java.util.List;

import com.ista.springboot.app.models.entity.Trueque;

public interface ITruequeService {

	public List<Trueque> findAll();
	
	public Trueque save (Trueque trueque);
	
	public Trueque findById(Long Id);
	
	public void delete(Long Id);
}

