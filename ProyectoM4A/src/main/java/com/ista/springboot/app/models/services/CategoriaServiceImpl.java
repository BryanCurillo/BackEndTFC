package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.ICategoriaDao;
import com.ista.springboot.app.models.entity.Categoria;
import com.ista.springboot.app.models.services.I.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaDao categoriaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	public Categoria save(Categoria categoria) {
		return categoriaDao.save(categoria);
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		categoriaDao.deleteById(id);
	}

}
