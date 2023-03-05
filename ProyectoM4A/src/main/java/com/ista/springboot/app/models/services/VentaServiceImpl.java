package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IVentaDao;
import com.ista.springboot.app.models.entity.Venta;
import com.ista.springboot.app.models.services.I.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaDao dao;

	@Override
	@Transactional(readOnly = true)
	public List<Venta> findAll() {
		// TODO Auto-generated method stub
		return (List<Venta>)dao.findAll();
	}

	@Override
	public Venta save(Venta venta) {
		// TODO Auto-generated method stub
		return dao.save(venta);
	}

	@Override
	@Transactional(readOnly = true)
	public Venta findById(Long Id) {

		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
	
		dao.deleteById(Id);
	}
	

}
