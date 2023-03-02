package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.PieFactura;

public interface IPieFacturaDao extends JpaRepository<PieFactura, Long> {

}
