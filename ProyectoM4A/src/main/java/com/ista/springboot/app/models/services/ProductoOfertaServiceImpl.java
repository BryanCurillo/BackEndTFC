package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IProductoOfertaDao;
import com.ista.springboot.app.models.entity.ProductoOferta;

@Service
public class ProductoOfertaServiceImpl implements IProductoOfertaService{

	@Autowired
	private IProductoOfertaDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ProductoOferta> findAll() {
		return (List<ProductoOferta>) dao.findAll();
	}

	@Override
	public ProductoOferta save(ProductoOferta oferta) {
		return dao.save(oferta);
	}

	@Override
	@Transactional(readOnly = true)
	public ProductoOferta findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
