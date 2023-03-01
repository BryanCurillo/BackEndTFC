package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IOfertaDao;
import com.ista.springboot.app.models.entity.Oferta;

@Service
public class OfertaServiceImpl implements IOfertaService{

	@Autowired
	private IOfertaDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Oferta> findAll() {
		return (List<Oferta>)dao.findAll();
	}

	@Override
	public Oferta save(Oferta oferta) {
		return dao.save(oferta);
	}

	@Override
	@Transactional(readOnly = true)
	public Oferta findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
