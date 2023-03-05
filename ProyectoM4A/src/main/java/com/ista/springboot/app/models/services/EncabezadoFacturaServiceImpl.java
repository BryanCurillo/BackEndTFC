package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IEncabezadoFacturaDao;
import com.ista.springboot.app.models.entity.EncabezadoFactura;
import com.ista.springboot.app.models.services.I.IEncabezadoService;


@Service
public class EncabezadoFacturaServiceImpl implements IEncabezadoService{

	@Autowired
	private IEncabezadoFacturaDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<EncabezadoFactura> findAll() {
		return (List<EncabezadoFactura>) dao.findAll();
	}

	@Override
	public EncabezadoFactura save(EncabezadoFactura encabezadoFactura) {
		return dao.save(encabezadoFactura);
	}

	@Override
	@Transactional(readOnly = true)
	public EncabezadoFactura findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
