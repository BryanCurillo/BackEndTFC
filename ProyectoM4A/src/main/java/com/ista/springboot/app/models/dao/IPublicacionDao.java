package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Publicacion;

public interface IPublicacionDao extends CrudRepository<Publicacion, Long> {

}
