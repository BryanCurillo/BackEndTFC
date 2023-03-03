package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IDetalleFacturaDao;
import com.ista.springboot.app.models.entity.DetalleFactura;
import com.ista.springboot.app.models.services.I.IDetalleFacturaService;

@Service
public class DetalleFacturaServiceImpl implements IDetalleFacturaService{

	@Autowired
	private IDetalleFacturaDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<DetalleFactura> findAll() {
		return (List<DetalleFactura>) dao.findAll();
	}

	@Override
	public DetalleFactura save(DetalleFactura detalleFactura) {
		return dao.save(detalleFactura);
	}

	@Override
	@Transactional(readOnly = true)
	public DetalleFactura findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}
	

}
