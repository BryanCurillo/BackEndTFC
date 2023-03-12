package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.ProductoOferta;

public interface IProductoOfertaDao extends JpaRepository<ProductoOferta, Long> {

}
