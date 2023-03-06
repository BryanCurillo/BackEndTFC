package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Categoria;

public interface ICategoriaDao extends CrudRepository<Categoria, Long> {

}
