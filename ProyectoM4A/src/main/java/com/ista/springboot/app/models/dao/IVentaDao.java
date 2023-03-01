package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Venta;

public interface IVentaDao extends CrudRepository<Venta, Long> {

}
