package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.PieFactura;

public interface IPieFacturaDao extends CrudRepository<PieFactura, Long> {

}
