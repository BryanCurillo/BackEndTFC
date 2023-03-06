package com.ista.springboot.app.models.services.I;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ista.springboot.app.models.entity.Persona;

@Service
public interface IPersonaService {

	public List<Persona> findAll();

	public Persona save(Persona persona);

	public Persona findById(Long id);

	public void delete(Long id);

}
