package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Oferta;

public interface IOfertaDao extends CrudRepository<Oferta, Long> {

}
