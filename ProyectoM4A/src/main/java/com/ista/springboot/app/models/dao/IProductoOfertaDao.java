package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.ProductoOferta;

public interface IProductoOfertaDao extends CrudRepository<ProductoOferta, Long> {

}
