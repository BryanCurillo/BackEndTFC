package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.DetalleFactura;

public interface IDetalleFacturaDao extends CrudRepository<DetalleFactura, Long> {

}
