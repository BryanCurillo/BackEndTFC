package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.DetalleFactura;

public interface IDetalleFacturaDao extends JpaRepository<DetalleFactura, Long> {

}
