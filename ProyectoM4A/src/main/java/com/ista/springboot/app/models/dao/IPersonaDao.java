package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.springboot.app.models.entity.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
