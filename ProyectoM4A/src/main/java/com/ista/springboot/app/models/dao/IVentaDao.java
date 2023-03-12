package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Venta;

public interface IVentaDao extends JpaRepository<Venta, Long> {

}
