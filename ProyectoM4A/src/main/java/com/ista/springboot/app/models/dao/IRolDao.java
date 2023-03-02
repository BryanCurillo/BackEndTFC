package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Rol;

public interface IRolDao extends JpaRepository<Rol, Long> {

}
