package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Publicacion;

public interface IPublicacionDao extends JpaRepository<Publicacion, Long> {

}
