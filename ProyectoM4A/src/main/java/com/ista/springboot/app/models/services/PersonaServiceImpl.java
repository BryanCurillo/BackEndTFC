package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IPersonaDao;
import com.ista.springboot.app.models.entity.Persona;
import com.ista.springboot.app.models.services.I.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) dao.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return dao.save(persona);
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
	
	//metodos personalizados
	
	@Override
	@Transactional(readOnly = true)
	public Boolean existByDni(String dni) {
		// TODO Auto-generated method stub
		return dao.existByPerCedula(dni);
	}

	@Override
	@Transactional(readOnly = true)
	public Boolean existByGmail(String gmail) {
		// TODO Auto-generated method stub
		return dao.existByPerCorreo(gmail);
	}


}
