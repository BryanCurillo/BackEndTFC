package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.IRolDao;
import com.ista.springboot.app.models.entity.Rol;
import com.ista.springboot.app.models.services.I.IRolService;

@Service
public class RolServiceImpl implements IRolService{

	@Autowired
	private IRolDao dao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAll() {
		return (List<Rol>)dao.findAll();
	}

	@Override
	public Rol save(Rol rol) {
		return dao.save(rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
