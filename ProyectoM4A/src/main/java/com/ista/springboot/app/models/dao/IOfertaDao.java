package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Oferta;

public interface IOfertaDao extends JpaRepository<Oferta, Long> {

}
