package com.ista.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.app.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
