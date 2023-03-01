package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
