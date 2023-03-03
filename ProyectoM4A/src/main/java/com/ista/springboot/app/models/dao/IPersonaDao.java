package com.ista.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ista.springboot.app.models.entity.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

	@Query("SELECT COUNT(p)>0  FROM Persona p WHERE p.PerCedula = :cedula ")
	boolean existByPerCedula(@Param("cedula")String PerCedula);
	
	@Query("SELECT COUNT(p)>0  FROM Persona p WHERE p.PerCorreo = :correo ")
	boolean existByPerCorreo(@Param("correo")String PerCorreo);
	
}
