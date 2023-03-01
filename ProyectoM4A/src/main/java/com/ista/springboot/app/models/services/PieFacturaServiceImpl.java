package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IPieFacturaDao;
import com.ista.springboot.app.models.entity.PieFactura;

@Service
public class PieFacturaServiceImpl implements IPieFacturaService {

	@Autowired
	private IPieFacturaDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<PieFactura> findAll() {
		return (List<PieFactura>) dao.findAll();
	}

	@Override
	public PieFactura save(PieFactura pieFactura) {
		return dao.save(pieFactura);
	}

	@Override
	@Transactional(readOnly = true)
	public PieFactura findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
