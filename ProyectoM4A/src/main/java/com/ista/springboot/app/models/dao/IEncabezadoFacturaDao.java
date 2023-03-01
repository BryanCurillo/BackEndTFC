package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.EncabezadoFactura;

public interface IEncabezadoFacturaDao extends CrudRepository<EncabezadoFactura, Long> {

}
