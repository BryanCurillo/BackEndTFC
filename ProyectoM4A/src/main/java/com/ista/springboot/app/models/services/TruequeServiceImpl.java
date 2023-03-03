package com.ista.springboot.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.app.models.dao.ITruequeDao;
import com.ista.springboot.app.models.entity.Trueque;
import com.ista.springboot.app.models.services.I.ITruequeService;

@Service
public class TruequeServiceImpl implements ITruequeService{

	@Autowired
	private ITruequeDao dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Trueque> findAll() {
		return (List<Trueque>)dao.findAll();
	}

	@Override
	public Trueque save(Trueque trueque) {
		return dao.save(trueque);
	}

	@Override
	@Transactional(readOnly = true)
	public Trueque findById(Long Id) {
		return dao.findById(Id).orElse(null);
	}

	@Override
	public void delete(Long Id) {
		dao.deleteById(Id);
	}

}
