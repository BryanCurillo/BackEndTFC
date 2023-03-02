package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.EncabezadoFactura;

public interface IEncabezadoFacturaDao extends JpaRepository<EncabezadoFactura, Long> {

}
