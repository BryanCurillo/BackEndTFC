package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long> {

}
