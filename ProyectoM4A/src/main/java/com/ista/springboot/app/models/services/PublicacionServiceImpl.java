package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IPublicacionDao;
import com.ista.springboot.app.models.entity.Publicacion;
import com.ista.springboot.app.models.services.I.IPublicacionService;

@Service
public class PublicacionServiceImpl implements IPublicacionService {

	@Autowired
	private IPublicacionDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Publicacion> findAll() {
		return (List<Publicacion>) dao.findAll();
	}

	@Override
	public Publicacion save(Publicacion publicacion) {
		return dao.save(publicacion);
	}

	@Override
	@Transactional(readOnly = true)
	public Publicacion findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
