package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Rol;

public interface IRolDao extends CrudRepository<Rol, Long> {

}
